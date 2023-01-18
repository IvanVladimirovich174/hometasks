package com.ninthhometask.ninthhometask.controller;

import com.ninthhometask.ninthhometask.model.Director;
import com.ninthhometask.ninthhometask.model.Film;
import com.ninthhometask.ninthhometask.model.Genre;
import com.ninthhometask.ninthhometask.service.DirectorService;
import com.ninthhometask.ninthhometask.service.FilmService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/film")
public class FilmController {
    private final FilmService filmService;
    private final DirectorService directorService;

    public FilmController(FilmService filmService, DirectorService directorService) {
        this.filmService = filmService;
        this.directorService = directorService;
    }

    @ApiOperation(value = "Получить список всех фильмов")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Film> list() {
        return filmService.getAllFilms();
    }

    @ApiOperation(value = "Получить фильм по Id")
    @GetMapping(value = "/{id}")
    public Film getById(@PathVariable Long id) {
        return filmService.getOneFilm(id);
    }

    @ApiOperation(value = "Добавить фильм")
    @PostMapping
    public Film create(@RequestBody Film film) {
        return filmService.createFilm(film);
    }

    @ApiOperation(value = "Обновить информацию о фильме")
    @PutMapping
    public Film update(@RequestBody Film film) {
        return filmService.updateFilm(film);
    }

    @ApiOperation(value = "Удалить информацию о фильме по Id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        filmService.deleteFilm(id);
    }

    @ApiOperation(value = "Добавить участника к фильму")
    @RequestMapping(value = "/addDirectorToFilm", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Film addDirectorsToFilm(@RequestParam(value = "filmId") Long filmId,
                                   @RequestParam(value = "directorId") Long directorId) {
        Director director = directorService.getOneDirector(directorId);
        Film film = filmService.getOneFilm(filmId);

        film.getDirectors().add(director);

        return filmService.updateFilm(film);
    }

    @ApiOperation(value = "Поиск фильмов по названию/стране/жанру")
    @RequestMapping(value = "/searchFilms", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Film> searchFilms(@RequestParam(value = "title", required = false) String title,
                                  @RequestParam(value = "country", required = false) String country,
                                  @RequestParam(value = "genre", required = false) Genre genre) {
        return filmService.searchFilms(title, country, genre);
    }
}