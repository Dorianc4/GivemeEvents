package it.unical.givemeevents.model;

import java.io.Serializable;

/**
 * Created by Manuel on 9/12/2017.
 */

public class EventPlace implements Serializable{

    private String id;
    private String name;
    private Location location;
    //ONLY FOR FAVORITES PLACES
    private String picture;

    public EventPlace() {
    }

    public EventPlace(String id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

}
