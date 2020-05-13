package com.gametime.gametime1.Services;

import com.gametime.gametime1.Models.GameGroups;
import com.gametime.gametime1.Repos.GameGroupsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameGroupsService {
    @Autowired
    GameGroupsRepo gameGroupsRepo;
    public Boolean save(GameGroups gameGroups){

        if(!gameGroupsRepo.existsGameByGroupName(gameGroups.getGroupName())){
            gameGroupsRepo.save(gameGroups);
            return true;
        }else{
            return false;
        }


    }
}
