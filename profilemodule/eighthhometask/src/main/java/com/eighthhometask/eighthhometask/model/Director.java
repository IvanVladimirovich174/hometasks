package com.eighthhometask.eighthhometask.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "directors")
public class Director extends GenericModel {

    @Column(name = "director_fio")
    private String directorFIO;

    @Column(name = "position")
    private String position;

    @ManyToMany(mappedBy = "directors", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private final Set<Film> films = new HashSet<>();
}