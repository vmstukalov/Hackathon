package ru.hackathon.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

//траектория

@Table(name = "track")
@Entity
public class Track {

    private Long id;
    private String name;
    @JsonIgnore
    private Way way;
    @JsonIgnore
    private List<Course> courses;

    private List<Interest> interests;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @ManyToOne
    @JoinColumn(name = "way")
    public Way getWay() {
        return way;
    }

    public void setWay(Way way) {
        this.way = way;
    }

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @ManyToMany(mappedBy = "tracks")
    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }
}
