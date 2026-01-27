package com.socialmedia.app;

import com.socialmedia.entities.Post;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post(
                "21/06/2018 13:05:44",
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        post1.addComment("Have a nice trip");
        post1.addComment("Wow that's awesome!");

        Post post2 = new Post(
                "28/07/2018 23:14:19",
                "Good night guys",
                "See you tomorrow",
                5);
        post2.addComment("Good Night");
        post2.addComment("May the Force be with you");

        System.out.println(post1);
        System.out.println();
        System.out.println(post2);
    }
}