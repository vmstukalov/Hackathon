package ru.hackathon.services;

import ru.hackathon.entities.Track;
import ru.hackathon.entities.Way;

import java.util.List;

public interface TrackService {

    Track getById(Long id);
    List<Track> getAll();
    List<Track> getByWay(Way way);

}
