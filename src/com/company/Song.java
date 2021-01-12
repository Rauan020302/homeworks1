package com.company;

public class Song {
    private String name;
    private String performer;
    private String genre;
    private String text;

    public Song(){}

    public Song(String text){
        this.text = text;
    }
    public Song(String name, String performer, String genre, String text) {
        this.name = name;
        this.performer = performer;
        this.genre = genre;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
