package com.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by DELL on 2017-07-14.
 */
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="dtype")
@Data
public abstract class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="game_id")
    private Game game;
}
