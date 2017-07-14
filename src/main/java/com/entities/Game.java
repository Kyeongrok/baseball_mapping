package com.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by DELL on 2017-07-14.
 */
@Entity
@Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "game", cascade = CascadeType.ALL)
    private Status status;


}
