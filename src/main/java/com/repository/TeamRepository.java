package com.repository;

import com.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kyeongrok.kim on 2017-06-28.
 */
interface TeamRepository extends JpaRepository<Team, Long>{
}
