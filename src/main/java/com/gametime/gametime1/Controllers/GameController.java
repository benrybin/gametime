package com.gametime.gametime1.Controllers;


import com.gametime.gametime1.Models.Game;
import com.gametime.gametime1.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping(path = "game/add")
    public Boolean addNewGame(@RequestBody Game game){
        System.out.println(game.getTitle());
        if (gameService.save(game)){
            return true;
        }else{
            return false;
        }
    }
    @GetMapping(path = "game/searchauto")
    public List<String> searchGameAutoComplete(@RequestParam String title){
        return gameService.gameSearchAuto(title);

    }
    @GetMapping(path = "game/search")
    public List<Game> searchGame(@RequestParam String title){
        return gameService.gameSearch(title);

    }


}
