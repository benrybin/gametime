package com.gametime.gametime1.Models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


abstract class GamePrefs {


    private String gameTitle;


    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }



}
