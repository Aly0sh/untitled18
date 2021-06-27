package com.company;

public abstract class Monkey implements jump, climb, eat {
    private int age;
    private String color;
    private int weight;
    private int height;
    protected boolean onTheTree;
    public Monkey(int age, String color, int weight, int height, boolean onTheTree){
        this.age=age;
        this.color=color;
        this.weight=weight;
        this.height=height;
        this.onTheTree=onTheTree;
    }
}

