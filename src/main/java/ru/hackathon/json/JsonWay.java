package ru.hackathon.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.hackathon.entities.Interest;
import ru.hackathon.entities.Track;

import java.util.List;
import java.util.Set;

public class JsonWay {

    private Long id;
    private String name;
    private List<Interest> interests;
    private Integer size;
    private List<Track> tracks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
