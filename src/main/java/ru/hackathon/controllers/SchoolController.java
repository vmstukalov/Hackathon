package ru.hackathon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.hackathon.entities.School;
import ru.hackathon.services.SchoolService;

@Controller
@RequestMapping("school")
public class SchoolController {

    private SchoolService schoolService;

    @CrossOrigin
    @GetMapping(value = "{id}", produces = "application/json")
    @ResponseBody
    public School school(@PathVariable("id") Long id) {
        return schoolService.getById(id);
    }

    @Autowired
    public void setSchoolService(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
}
