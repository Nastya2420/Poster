package ru.netology.Poster.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmTest {


    private Film film1 = new Film(1, "Бладшот", "боевик", false);
    private Film film2 = new Film(2, "Вперёд", "мультфильм", false);
    private Film film3 = new Film(3, "Отель 'Белград'", "комедия", false);
    private Film film4 = new Film(4, "Джентельмены", "боевик", false);
    private Film film5 = new Film(5, "Человек-невидимка", "ужасы", false);
    private Film film6 = new Film(6, "Тролли. Мировой тур", "мультфильм", false);
    private Film film7 = new Film(7, "Номер один", "комедия", false);
    private Film film8 = new Film(8, "Ты, мой дом", "мелодрама", false);
    private Film film9 = new Film(9, "Девятаев", "драма", false);
    private Film film10 = new Film(10, "Великая", "драма", false);
    private Film film11 = new Film(11, "Душа", "семейный", false);


    @Test
    public void nullMovie() {
        FilmManager movie = new FilmManager();
        Film[] expected = {};
        Film[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test //Добавление нового фильма
    public void addFilm() {
        FilmManager movie = new FilmManager();
        movie.add(film7);
        movie.add(film8);
        movie.add(film9);
        movie.add(film10);
        Film[] expected = {film7, film8, film9, film10};
        Film[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test //Вывод всех фильмов в порядке добавления

    public void Limit10() {
        FilmManager movie = new FilmManager();
        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);
        movie.add(film6);
        movie.add(film7);
        movie.add(film8);
        movie.add(film9);
        movie.add(film10);
        Film[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        Film[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Limit11() {
        FilmManager movie = new FilmManager();
        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);
        movie.add(film6);
        movie.add(film7);
        movie.add(film8);
        movie.add(film9);
        movie.add(film10);
        movie.add(film11);
        Film[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        Film[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Limit5() {
        FilmManager movie = new FilmManager();
        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);
        Film[] expected = {film1, film2, film3, film4, film5};
        Film[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test //Вывод максимального лимита* последних добавленных фильмов в обратном от добавления порядке
    public void inTheReverseOrderFromTheAddition() {
        FilmManager movie = new FilmManager();
        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);
        movie.add(film6);
        movie.add(film7);
        movie.add(film8);
        movie.add(film9);
        movie.add(film10);
        Film[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Film[] actual = movie.findLastTen();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void Limit8() {
        FilmManager movie = new FilmManager();
        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);
        movie.add(film6);
        movie.add(film7);
        movie.add(film8);
        Film[] expected = {film8, film7, film6, film5, film4, film3, film2, film1};
        Film[] actual = movie.findLastTen();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void Limit3() {
        FilmManager movie = new FilmManager();
        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        Film[] expected = {film3, film2, film1};
        Film[] actual = movie.findLastTen();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void LimitMax () {
        FilmManager movie = new FilmManager();
        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);
        movie.add(film6);
        movie.add(film7);
        movie.add(film8);
        movie.add(film9);
        movie.add(film10);
        Film[] expected = { film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Film[] actual = movie.findLastTen();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void aboveTheLimit () {
        FilmManager movie = new FilmManager();
        movie.add(film1);
        movie.add(film2);
        movie.add(film3);
        movie.add(film4);
        movie.add(film5);
        movie.add(film6);
        movie.add(film7);
        movie.add(film8);
        movie.add(film9);
        movie.add(film10);
        movie.add(film11);
        Film[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Film[] actual = movie.findLastTen();
        Assertions.assertArrayEquals(expected, actual);
    }




}
