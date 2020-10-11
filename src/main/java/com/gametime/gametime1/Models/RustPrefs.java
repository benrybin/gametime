package com.gametime.gametime1.Models;

import javax.persistence.*;

@Entity

public class RustPrefs extends GamePrefs{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //fields
    private String idealGroupSize;
    private String idealServerType;
    private String playStyle;
    private Integer userPlayingHours;
    private Integer minPlayingHours;
    private Integer maxPlayingHours;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User activeUser;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdealGroupSize() {
        return idealGroupSize;
    }

    public void setIdealGroupSize(String idealGroupSize) {
        this.idealGroupSize = idealGroupSize;
    }

    public String getIdealServerType() {
        return idealServerType;
    }

    public void setIdealServerType(String idealServerType) {
        this.idealServerType = idealServerType;
    }

    public String getPlayStyle() {
        return playStyle;
    }

    public void setPlayStyle(String playStyle) {
        this.playStyle = playStyle;
    }

    public Integer getUserPlayingHours() {
        return userPlayingHours;
    }

    public void setUserPlayingHours(Integer userPlayingHours) {
        this.userPlayingHours = userPlayingHours;
    }

    public Integer getMinPlayingHours() {
        return minPlayingHours;
    }

    public void setMinPlayingHours(Integer minPlayingHours) {
        this.minPlayingHours = minPlayingHours;
    }

    public Integer getMaxPlayingHours() {
        return maxPlayingHours;
    }

    public void setMaxPlayingHours(Integer maxPlayingHours) {
        this.maxPlayingHours = maxPlayingHours;
    }
}
