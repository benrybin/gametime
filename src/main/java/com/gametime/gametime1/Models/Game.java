package com.gametime.gametime1.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String title;

    private Set<String> descriptors;


}
