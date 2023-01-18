package com.ninthhometask.ninthhometask.service;

import com.ninthhometask.ninthhometask.model.Film;
import com.ninthhometask.ninthhometask.model.Genre;
import com.ninthhometask.ninthhometask.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Film getOneFilm(Long id) {
        return filmRepository.findById(id).orElseThrow();
    }

    public Film createFilm(Film film) {
        return filmRepository.save(film);
    }

    public Film updateFilm(Film film) {
        return filmRepository.save(film);
    }

    public void deleteFilm(Long id) {
        filmRepository.deleteById(id);
    }

    public List<Film> searchFilms(String title, String country, Genre genre) {
        return filmRepository.findAll(title, country, genre);
    }
}