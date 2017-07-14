package com.repository;

import com.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by DELL on 2017-07-14.
 */
public interface GameRepository extends JpaRepository<Game, Long> {
}
