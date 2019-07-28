package ru.hackathon.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.hackathon.entities.Course;
import ru.hackathon.entities.Way;

import java.util.List;

public class JsonTrack {


    private List<Course> courses;
    private String name;
    private String result;
    private Integer size;

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
