package ru.netology.Poster.services;

public class FilmManager {
    private int countFilm = 10;
    private Film[] films = new Film[0];

    public FilmManager(int countMovie) {
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
        int resultLength = films.length;
        if (resultLength >= countFilm) {
            resultLength = countFilm;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < films.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public Film[] findAll() {
        return films;
    }
}

































































