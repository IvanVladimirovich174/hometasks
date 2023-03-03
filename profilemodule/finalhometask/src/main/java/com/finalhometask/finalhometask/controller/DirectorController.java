package com.finalhometask.finalhometask.controller;

import com.finalhometask.finalhometask.model.Director;
import com.finalhometask.finalhometask.model.Film;
import com.finalhometask.finalhometask.model.Order;
import com.finalhometask.finalhometask.service.DirectorService;
import com.finalhometask.finalhometask.service.FilmService;
import com.finalhometask.finalhometask.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/director")
public class DirectorController {
    private final DirectorService directorService;
    private final FilmService filmService;
    private final OrderService orderService;

    public DirectorController(DirectorService directorService, FilmService filmService, OrderService orderService) {
        this.directorService = directorService;
        this.filmService = filmService;
        this.orderService = orderService;
    }

    @ApiOperation(value = "Получить список всех режиссеров")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Director> list() {
        return directorService.getAllDirectors();
    }

    @ApiOperation(value = "Получить режиссера по Id")
    @GetMapping(value = "/{id}")
    public Director getById(@PathVariable Long id) {
        return directorService.getOneDirector(id);
    }

    @ApiOperation(value = "Добавить режиссера")
    @PostMapping
    public Director create(@RequestBody Director director) {
        return directorService.createDirector(director);
    }

    @ApiOperation(value = "Обновить информацию о режиссере")
    @PutMapping
    public Director update(@RequestBody Director director) {
        return directorService.updateDirector(director);
    }

    @ApiOperation(value = "Удалить информацию о режиссере по Id и фильмах с единоличным участием данного режисера")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        List<Film> filmsWithSingleDirector = filmService.getFilmsByDirector(id)
                .stream()
                .filter(film -> film.getDirectors().size() == 1)
                .toList();
        List<Order> ordersByFilmsWithSingleDirector =
                orderService.getOrdersByFilms(filmsWithSingleDirector);

        if (ordersByFilmsWithSingleDirector.isEmpty()) {
            directorService.deleteDirector(id);
            filmService.deleteFilmsByDirectorId(id);
        }
    }
}