package com.example.troutslider;

public class Trout {
    private String description;
    private  int imageID;

    public Trout(String description, int imageID) {
        this.description = description;
        this.imageID = imageID;
    }

    public String getDescription() {
        return description;
    }

    public int getImageID() {
        return imageID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
