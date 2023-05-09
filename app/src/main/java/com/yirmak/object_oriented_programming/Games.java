package com.yirmak.object_oriented_programming;

public class Games {

    private String name;
    private String game;
    private int age;

    public Games(String name, String game, int age) {

        this.name = name;
        this.game = game;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGame() {
        return game;
    }

    public int getAge() {
        return age;
    }
}
