package ru.hackathon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.hackathon.entities.Course;
import ru.hackathon.entities.Track;
import ru.hackathon.json.JsonTrack;
import ru.hackathon.services.CourseService;
import ru.hackathon.services.TrackService;

import java.util.List;

@Controller
@RequestMapping("track")
public class TrackController {


    private TrackService trackService;
    private CourseService courseService;

    @CrossOrigin
    @GetMapping(value = "{id}", produces = "application/json")
    @ResponseBody
    public JsonTrack track(@PathVariable("id") Long id) {

        Track track = trackService.getById(id);

        List<Course> courses = courseService.getByTrack(track);

        JsonTrack result = new JsonTrack();
        result.setCourses(courses);
        result.setName(track.getName());
        //result.set


        return result;
    }

    @Autowired
    public void setTrackService(TrackService trackService) {
        this.trackService = trackService;
    }

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }
}
