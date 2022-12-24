package com.eighthhometask.eighthhometask.controller;

import com.eighthhometask.eighthhometask.model.User;
import com.eighthhometask.eighthhometask.repository.UserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ApiOperation(value = "Получить список всех пользователей")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userRepository.findAll();
    }

    @ApiOperation(value = "Получить пользователя по Id")
    @GetMapping(value = "/{id}")
    public User getById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @ApiOperation(value = "Добавить пользователя")
    @PostMapping
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }

    @ApiOperation(value = "Обновить информацию о пользователе по Id")
    @PutMapping("/{id}")
    public User update(@RequestBody User user, @PathVariable Long id) {
        user.setId(id);
        return userRepository.save(user);
    }

    @ApiOperation(value = "Удалить информацию о пользователе по Id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}