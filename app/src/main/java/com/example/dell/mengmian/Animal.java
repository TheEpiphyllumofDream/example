package com.example.dell.mengmian;

public class Animal {
    private int image;
    private  String text;

    public Animal(int image) {
        this.image = image;
    }

    public Animal(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
