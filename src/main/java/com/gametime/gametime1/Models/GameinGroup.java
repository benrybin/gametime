package com.gametime.gametime1.Models;

import javax.persistence.*;

@Entity
public class GameinGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="game_id")
    private Game games;


    @ManyToOne
    @JoinColumn(name="gamegroup_id")
    private GameGroups gameGroup;

    private String playstyle;
    private String gameTitle;

    public GameinGroup(Game games,GameGroups gameGroup,String playstyle){
        this.games = games;
        this.gameGroup = gameGroup;
        this.playstyle=playstyle;
    }

}
