package ru.hackathon.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.hackathon.entities.Course;
import ru.hackathon.entities.Skill;
import ru.hackathon.services.CourseService;
import ru.hackathon.services.SkillService;
import ru.hackathon.services.repo.CourseRepo;

import java.util.List;

@Controller
@RequestMapping("course")
public class CourseController {


    private CourseService courseService;
    private SkillService skillService;

    @CrossOrigin
    @GetMapping(value = "{id}", produces = "application/json")
    @ResponseBody
    public Course getCourse(@PathVariable("id") Long id) {
        return courseService.getOne(id);
    }

    @CrossOrigin
    @GetMapping("bySkill")
    @ResponseBody
    public List<Course> bySkill(@RequestParam("id") Long id) {

        Skill skill = skillService.getById(id);
        return skill.getCourses();
    }

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @Autowired
    public void setSkillServicel(SkillService skillService) {
        this.skillService = skillService;
    }
}
