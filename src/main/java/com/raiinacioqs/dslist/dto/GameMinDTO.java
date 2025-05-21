package com.raiinacioqs.dslist.dto;

import com.raiinacioqs.dslist.entities.Game;

public class GameMinDTO {
    
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {

    }

    public GameMinDTO(Game enitity) {
        id = enitity.getId();
        title = enitity.getTitle();
        year = enitity.getYear();
        imgUrl = enitity.getImgUrl();
        shortDescription = enitity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    
}
