package com.seventhhometask.seventhhometask.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "rent_date")
    private LocalDateTime rentDate;

    @Column(name = "rent_period")
    private Integer rentPeriod;

    @Column(name = "purchase")
    private Boolean isPurchased;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_PUBLISHING_USER"))
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", foreignKey = @ForeignKey(name = "FK_PUBLISHING_FILM"))
    private Film film;
}