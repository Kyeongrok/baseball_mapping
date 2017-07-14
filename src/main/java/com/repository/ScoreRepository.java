package com.repository;

import com.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kyeongrok.kim on 2017-06-28.
 */
public interface ScoreRepository extends JpaRepository<Score, Long> {
}
