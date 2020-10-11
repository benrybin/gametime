package com.gametime.gametime1.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="gamegroups")
public class GameGroups {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String groupName;
    @OneToMany(mappedBy = "gameGroup", cascade = CascadeType.ALL)
    private Set<GameinGroup> nothing ;


    public Long getId() {
        return Id;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
