package com.ninthhometask.ninthhometask.controller;

import com.ninthhometask.ninthhometask.model.Film;
import com.ninthhometask.ninthhometask.model.User;
import com.ninthhometask.ninthhometask.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "Получить список всех пользователей")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.getAllUsers();
    }

    @ApiOperation(value = "Получить пользователя по Id")
    @GetMapping(value = "/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getOneUser(id);
    }

    @ApiOperation(value = "Добавить пользователя")
    @PostMapping
    public User create(@RequestBody User user) {
        return userService.createUser(user);
    }

    @ApiOperation(value = "Обновить информацию о пользователе")
    @PutMapping
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @ApiOperation(value = "Удалить информацию о пользователе по Id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @ApiOperation(value = "Получить список всех купленных/арендованных фильмов пользователя")
    @RequestMapping(value = "/purchasedAndRentalFilms", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Film> addDirectorsToFilm(@RequestParam(value = "userId") Long userId) {
        return userService.getAllRentalAndPurchasedFilmsByUser(userId);
    }
}