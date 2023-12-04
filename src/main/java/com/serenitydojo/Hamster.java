package com.serenitydojo;

public class Hamster extends Pet {

    private String name;
    private String favoriteToy;
    private int age;

    public Hamster(String name, int age, String favoriteToy) {
        super(name, age);
    }

    @Override
    public String play() {
        return "runs on wheel";
    }
}
