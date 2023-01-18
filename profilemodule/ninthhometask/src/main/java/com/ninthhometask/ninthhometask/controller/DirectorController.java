package com.ninthhometask.ninthhometask.controller;

import com.ninthhometask.ninthhometask.model.Director;
import com.ninthhometask.ninthhometask.service.DirectorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/director")
public class DirectorController {
    private final DirectorService directorService;

    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
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

    @ApiOperation(value = "Удалить информацию о режиссере по Id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        directorService.deleteDirector(id);
    }
}