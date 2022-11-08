package ru.netology.Poster.services;

public class Film {

    private int id;
    private String name;
    private String genre;
    private boolean premiere;


    public Film(int id, String name, String genre, boolean premiere) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.premiere = premiere;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre() {
        this.genre = genre;
    }

    public boolean isPremiere() {
        return premiere;
    }

    public void setPremiere() {
        this.premiere = premiere;
    }
}
