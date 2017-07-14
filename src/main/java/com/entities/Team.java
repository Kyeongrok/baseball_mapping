package com.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by kyeongrok.kim on 2017-06-28.
 */
@Entity
@Data
public class Team {
    @Id
    long id;
    String name;

    @OneToMany(mappedBy = "team")
    List<Score> scores;
}
