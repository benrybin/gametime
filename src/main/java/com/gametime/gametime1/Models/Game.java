package com.gametime.gametime1.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String title;
    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(
                    name = "Game_Tags",
                    joinColumns = {@JoinColumn(name="game_id")},
                    inverseJoinColumns = {@JoinColumn(name="tags_id")}
            )
    Set<Tags> tags = new HashSet<>();



}
