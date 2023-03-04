package com.finalhometask.finalhometask.service;

import com.finalhometask.finalhometask.dto.LoginDto;
import com.finalhometask.finalhometask.model.Film;
import com.finalhometask.finalhometask.model.User;
import com.finalhometask.finalhometask.repository.FilmRepository;
import com.finalhometask.finalhometask.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final FilmRepository filmRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, FilmRepository filmRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.filmRepository = filmRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
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

    public User getByLogin(String login) {
        return userRepository.findUsersByLogin(login);
    }
    public boolean checkPassword(LoginDto loginDto) {
        return bCryptPasswordEncoder.matches(loginDto.getPassword(), getByLogin(loginDto.getLogin()).getPassword());
    }
}