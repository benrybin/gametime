package com.gametime.gametime1.Services;

import com.gametime.gametime1.Models.Game;
import com.gametime.gametime1.Repos.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    GameRepo gameRepo;

    public Boolean save(Game game){

        if(!gameRepo.existsGameByTitle(game.getTitle())){
            gameRepo.save(game);
            return true;
        }else{
            return false;
        }


    }
}
