package com.repository;

import com.entities.BaseballScore;
import com.entities.League;
import com.entities.Score;
import com.entities.Team;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by kyeongrok.kim on 2017-06-28.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class TeamRepositoryTest {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Test
    public void saveManyToOne() throws Exception {
        League league = new League();

        Team aTeam = new Team();
        league.setTeams(Arrays.asList(
                aTeam
        ));

        leagueRepository.save(league);

        League selectedLeague = leagueRepository.findOne(league.getId());
        System.out.println(selectedLeague);
    }

    @Test
    public void saveAndSelect() throws Exception {
        Team team = new Team();
        team.setId(1);
        team.setName("한화");

        BaseballScore score1Inning = new BaseballScore();
        score1Inning.setId(1);
        score1Inning.setInning(1);
        score1Inning.setScore(2);

        BaseballScore score2Inning = new BaseballScore();
        score1Inning.setId(2);
        score1Inning.setInning(2);
        score1Inning.setScore(3);

        scoreRepository.save(Arrays.asList(score1Inning, score2Inning));


        team.setScores(Arrays.asList(score1Inning, score2Inning));
        teamRepository.save(team);

        Team selectedTeam = teamRepository.findOne(1l);
        assertEquals(1l, selectedTeam.getId());
        assertEquals("한화", selectedTeam.getName());


    }
}