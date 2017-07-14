package com.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by kyeongrok.kim on 2017-07-05.
 */
@Entity
@Data
public class League {
    @Id
    long id;

    @OneToMany
    List<Team> teams;
}
