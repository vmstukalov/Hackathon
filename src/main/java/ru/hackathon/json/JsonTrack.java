package ru.hackathon.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.hackathon.entities.Course;
import ru.hackathon.entities.Way;

import java.util.List;

public class JsonTrack {


    private List<Course> courses;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


}
