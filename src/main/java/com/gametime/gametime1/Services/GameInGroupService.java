package com.gametime.gametime1.Services;

import com.gametime.gametime1.Models.Game;
import com.gametime.gametime1.Models.GameGroups;
import com.gametime.gametime1.Models.GameinGroup;
import com.gametime.gametime1.Repos.GameGroupsRepo;
import com.gametime.gametime1.Repos.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameInGroupService {
    @Autowired
    GameGroupsRepo gameGroupsRepo;
    @Autowired
    GameRepo gameRepo;

    public void addNewGametoGroup(Integer gameid,Integer groupid,String playstyle){

        Optional<Game> game = gameRepo.findById(Long.valueOf(gameid));
        Optional<GameGroups> gameGroup = gameGroupsRepo.findById(Long.valueOf(groupid));
        if(game.isPresent()&&!gameGroup.isPresent()) {
            GameinGroup createGameinGroup = new GameinGroup(game.get(),gameGroup.get(),"test");
        }
    }

}
