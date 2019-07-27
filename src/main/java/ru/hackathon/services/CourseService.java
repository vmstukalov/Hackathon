package ru.hackathon.services;

import ru.hackathon.entities.Course;
import ru.hackathon.entities.Track;

import java.util.List;

public interface CourseService {

    List<Course> getByTrack(Track track);
    Course getOne(Long id);
}
