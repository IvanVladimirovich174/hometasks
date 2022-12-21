package com.seventhhometask.seventhhometask.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "directors")
public class Director {

    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "director_fio")
    private String directorFIO;

    @Column(name = "position")
    private String position;

    @ManyToMany(mappedBy = "directors", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private final Set<Film> films = new HashSet<>();
}