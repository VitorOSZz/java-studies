package org.example._1simplejunit;

public class Singer {

    private String name;
    private int grammys;

    public Singer(String name, int grammys) {
        this.name = name;
        this.grammys = grammys;
    }

    public String getName() {
        return name;
    }

    public int getGrammys() {
        return grammys;
    }

    public String bestSinger() {
        return "Billie Eilish";
    }
}
