package ru.hackathon.services;

import ru.hackathon.entities.Interest;
import ru.hackathon.entities.Way;

import java.util.List;
import java.util.Set;

public interface InterestService {

    Interest save(Interest interest);
    List<Interest> getAllInterests();
    Interest getById(Long id);


}
