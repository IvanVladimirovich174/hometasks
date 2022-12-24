package com.eighthhometask.eighthhometask.controller;

import com.eighthhometask.eighthhometask.model.Film;
import com.eighthhometask.eighthhometask.repository.FilmRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/film")
public class FilmController {

    private final FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @ApiOperation(value = "Получить список всех фильмов")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Film> list() {
        return filmRepository.findAll();
    }

    @ApiOperation(value = "Получить фильм по Id")
    @GetMapping(value = "/{id}")
    public Film getById(@PathVariable Long id) {
        return filmRepository.findById(id).orElseThrow();
    }

    @ApiOperation(value = "Добавить фильм")
    @PostMapping
    public Film create(@RequestBody Film film) {
        return filmRepository.save(film);
    }

    @ApiOperation(value = "Обновить информацию о фильме по Id")
    @PutMapping("/{id}")
    public Film update(@RequestBody Film film, @PathVariable Long id) {
        film.setId(id);
        return filmRepository.save(film);
    }

    @ApiOperation(value = "Удалить информацию о фильме по Id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        filmRepository.deleteById(id);
    }
}