package com.repository;

import com.entities.League;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kyeongrok.kim on 2017-07-05.
 */
public interface LeagueRepository extends JpaRepository<League, Long> {
}
