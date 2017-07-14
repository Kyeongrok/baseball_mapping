package com.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by kyeongrok.kim on 2017-06-28.
 */
@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="dtype")
public abstract class Score {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

}
