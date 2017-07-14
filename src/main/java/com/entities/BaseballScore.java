package com.entities;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by kyeongrok.kim on 2017-06-28.
 */
@Entity
@DiscriminatorValue("baseball")
@Data
public class BaseballScore extends Score{
    private int inning;
    private int score;
}
