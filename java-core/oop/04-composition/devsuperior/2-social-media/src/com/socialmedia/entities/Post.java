package com.socialmedia.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private final LocalDateTime createdAt;
    private String title;
    private String content;
    private int likes;
    private List<Comment> commentList;

    public Post(String createdAt, String title, String content, int likes) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.createdAt = LocalDateTime.parse(createdAt, formatter);
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.commentList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        text.append(this.title);
        text.append("\n");
        text.append(this.likes).append(" likes");
        text.append(" - ").append(this.createdAt.format(formatter));
        text.append("\n");
        text.append("Comments: ");
        text.append("\n");
        for (Comment comment : this.commentList) {
            text.append(comment.text);
            text.append("\n");
        }
        return text.toString();
    }

    public void addComment(String text) {
        Comment comment = new Comment(text);
        this.commentList.add(comment);
    }
}
