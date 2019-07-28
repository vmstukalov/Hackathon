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
    private List<Skill> skills;
    private String result;

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

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "track_skill",
            joinColumns = @JoinColumn(name = "track_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Column(name = "result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
