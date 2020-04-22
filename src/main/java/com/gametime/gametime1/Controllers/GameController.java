package com.gametime.gametime1.Controllers;


import com.gametime.gametime1.Models.Game;
import com.gametime.gametime1.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping(path = "game/add")
    public String addNewGame(@RequestBody Game game){
        System.out.println(game.getTitle());
        if (gameService.save(game)){
            return "Game Saved Sucessfully";
        }else{
            return "Game Already Exists";
        }
    }

}
