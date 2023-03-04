package com.finalhometask.finalhometask.controller;

import com.finalhometask.finalhometask.dto.LoginDto;
import com.finalhometask.finalhometask.model.Film;
import com.finalhometask.finalhometask.model.User;
import com.finalhometask.finalhometask.security.JwtTokenUtil;
import com.finalhometask.finalhometask.service.UserService;
import com.finalhometask.finalhometask.service.userDetails.CustomUserDetailsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final CustomUserDetailsService customUserDetailsService;
    private final JwtTokenUtil jwtTokenUtil;

    public UserController(UserService userService, CustomUserDetailsService customUserDetailsService, JwtTokenUtil jwtTokenUtil) {
        this.userService = userService;
        this.customUserDetailsService = customUserDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
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

    @ApiOperation(value = "Аутентификация пользователя")
    @PostMapping("/auth")
    public ResponseEntity<?> auth(@RequestBody LoginDto loginDto) {
        Map<String, Object> response = new HashMap<>();

        if (!userService.checkPassword(loginDto)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("UNAUTHORIZED USER \n WRONG PASSWORD");
        }

        UserDetails foundedUser = customUserDetailsService.loadUserByUsername(loginDto.getLogin());
        String token = jwtTokenUtil.generateToken(foundedUser);

        response.put("token", token);
        response.put("authorities", foundedUser.getAuthorities());

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @ApiOperation(value = "Получить список всех купленных/арендованных фильмов пользователя")
    @RequestMapping(value = "/purchasedAndRentalFilms", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Film> addDirectorsToFilm(@RequestParam(value = "userId") Long userId) {
        return userService.getAllRentalAndPurchasedFilmsByUser(userId);
    }
}