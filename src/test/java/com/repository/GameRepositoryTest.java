package com.repository;

import com.entities.FootballStatus;
import com.entities.Game;
import com.entities.Status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by DELL on 2017-07-14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class GameRepositoryTest {
    @Autowired
    private GameRepository gameRepository;

    @Test
    public void saveAndFind() throws Exception {
        Game game = new Game();
        Status status = new FootballStatus();
        game.setStatus(status);

        gameRepository.save(game);

        System.out.println(game.getId());

    }
}