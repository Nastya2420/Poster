package ru.netology.Poster.services;

public class FilmManager {
    private int countFilm = 10;
    private Film[] films = new Film[0];

    public FilmManager(int countFilm) {
        this.countFilm = countFilm;
    }

    public FilmManager() {

    }

    public void add(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findLastTen() {
        int resultLength;
        if (films.length < countFilm) {
            resultLength = films.length;
        } else
            resultLength = countFilm;
        Film[] tmp = new Film[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - i - 1];

        }
        return tmp;
    }

    public Film[] findAll() {
        return films;
    }
}

































































