package com.eighthhometask.eighthhometask.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order extends GenericModel {

    @Column(name = "rent_date")
    private LocalDateTime rentDate;

    @Column(name = "rent_period")
    private Date rentPeriod;

    @Column(name = "purchase")
    private Boolean isPurchased;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_PUBLISHING_USER"))
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", foreignKey = @ForeignKey(name = "FK_PUBLISHING_FILM"))
    private Film film;
}