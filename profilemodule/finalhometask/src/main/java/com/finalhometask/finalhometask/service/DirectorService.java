package com.finalhometask.finalhometask.service;

import com.finalhometask.finalhometask.model.Director;
import com.finalhometask.finalhometask.repository.DirectorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {
    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    public Director getOneDirector(Long id) {
        return directorRepository.findById(id).orElseThrow();
    }

    public Director createDirector(Director director) {
        return directorRepository.save(director);
    }

    public Director updateDirector(Director director) {
        return directorRepository.save(director);
    }

    public void deleteDirector(Long id) {
        directorRepository.deleteById(id);
    }
}