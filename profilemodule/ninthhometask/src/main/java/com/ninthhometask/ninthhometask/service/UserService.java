package com.ninthhometask.ninthhometask.service;

import com.ninthhometask.ninthhometask.model.Film;
import com.ninthhometask.ninthhometask.model.User;
import com.ninthhometask.ninthhometask.repository.FilmRepository;
import com.ninthhometask.ninthhometask.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final FilmRepository filmRepository;

    public UserService(UserRepository userRepository, FilmRepository filmRepository) {
        this.userRepository = userRepository;
        this.filmRepository = filmRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getOneUser(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<Film> getAllRentalAndPurchasedFilmsByUser(Long id) {
        return filmRepository.findAll(id);
    }
}