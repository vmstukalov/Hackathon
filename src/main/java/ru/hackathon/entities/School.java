package ru.hackathon.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "school")
public class School {

    private Long id;
    private String name;
    private String url;
    @JsonBackReference
    private List<Course> courses;
    private Double rating;
    @JsonManagedReference
    private List<SchoolReview> reviews;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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

    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Column(name = "rating")
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @OneToMany(mappedBy = "school", fetch = FetchType.LAZY)
    public List<SchoolReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<SchoolReview> reviews) {
        this.reviews = reviews;
    }
}
