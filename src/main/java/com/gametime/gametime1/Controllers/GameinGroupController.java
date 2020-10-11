package com.gametime.gametime1.Controllers;

import com.gametime.gametime1.Services.GameInGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GameinGroupController {
    @Autowired
    GameInGroupService gameInGroupService;

    @PostMapping(path = "addgametogroup")
    public void addNewGameinGroup(@RequestParam Integer gameid,@RequestParam Integer groupid,@RequestParam String playstle){
        gameInGroupService.addNewGametoGroup(gameid,groupid,playstle);

    }
}
