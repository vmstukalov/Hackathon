package ru.hackathon.services;

import ru.hackathon.entities.Interest;
import ru.hackathon.entities.Way;

import java.util.List;

public interface WayService {

    List<Way> getWaysByInterests(List<Long> interests);
    List<Way> getWaysByInterestName(String name);
    List<Way> getWaysByInterest(Interest interest);
    Way getById(Long id);

}
