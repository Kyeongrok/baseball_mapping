package com.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by DELL on 2017-07-14.
 */
@Entity
@DiscriminatorValue("football")
@Data
public class FootballStatus extends Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
}
