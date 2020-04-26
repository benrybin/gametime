package com.gametime.gametime1.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tagsId;
    private String tag;
    private Long gameid;
    @ManyToMany(mappedBy = "tags")
    private Set<Game> games = new HashSet<>();

    public Long getTagsId() {
        return tagsId;
    }

    public void setTagsId(Long tagsId) {
        this.tagsId = tagsId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getGameid() {
        return gameid;
    }

    public void setGameid(Long gameid) {
        this.gameid = gameid;
    }
}
