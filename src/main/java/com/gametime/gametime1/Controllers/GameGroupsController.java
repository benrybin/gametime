package com.gametime.gametime1.Controllers;

import com.gametime.gametime1.Models.GameGroups;
import com.gametime.gametime1.Services.GameGroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GameGroupsController {
    @Autowired
    GameGroupsService gameGroupsService;

    @PostMapping(path = "gamegroups/add")
    public Boolean addNewGroup(@RequestBody GameGroups gameGroups){
        System.out.println(gameGroups.getGroupName());
        if (gameGroupsService.save(gameGroups)){
            return true;
        }else{
            return false;
        }
    }


}
