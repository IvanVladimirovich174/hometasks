package com.eighthhometask.eighthhometask.controller;

import com.eighthhometask.eighthhometask.model.Director;
import com.eighthhometask.eighthhometask.repository.DirectorRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/director")
public class DirectorController {

    private final DirectorRepository directorRepository;

    public DirectorController(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @ApiOperation(value = "Получить список всех режиссеров")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Director> list() {
        return directorRepository.findAll();
    }

    @ApiOperation(value = "Получить режиссера по Id")
    @GetMapping(value = "/{id}")
    public Director getById(@PathVariable Long id) {
        return directorRepository.findById(id).orElseThrow();
    }

    @ApiOperation(value = "Добавить режиссера")
    @PostMapping
    public Director create(@RequestBody Director director) {
        return directorRepository.save(director);
    }

    @ApiOperation(value = "Обновить информацию о режиссере по Id")
    @PutMapping("/{id}")
    public Director update(@RequestBody Director director, @PathVariable Long id) {
        director.setId(id);
        return directorRepository.save(director);
    }

    @ApiOperation(value = "Удалить информацию о режиссере по Id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        directorRepository.deleteById(id);
    }
}