package com.finalhometask.finalhometask.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @ManyToMany(mappedBy = "directors", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private final Set<Film> films = new HashSet<>();
}