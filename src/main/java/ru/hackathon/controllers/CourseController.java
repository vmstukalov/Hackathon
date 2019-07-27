package ru.hackathon.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.hackathon.entities.Course;
import ru.hackathon.services.CourseService;
import ru.hackathon.services.repo.CourseRepo;

@Controller
@RequestMapping("course")
public class CourseController {


    private CourseService courseService;

    @CrossOrigin
    @GetMapping(value = "{id}", produces = "application/json")
    @ResponseBody
    public Course getCourse(@PathVariable("id") Long id) {
        return courseService.getOne(id);
    }

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }
}
