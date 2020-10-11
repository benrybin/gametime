package com.gametime.gametime1.Controllers;

import com.gametime.gametime1.Models.RustPrefs;
import com.gametime.gametime1.Repos.RustPrefsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GamePrefsController {
    @Autowired
    RustPrefsRepo rustPrefsRepo;
    @PostMapping(path = "user/addrustprefs")
    public void addNewGamePrefs(@RequestBody RustPrefs rustPrefs){
        rustPrefsRepo.save(rustPrefs);

    }

}
