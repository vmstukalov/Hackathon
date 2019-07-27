package ru.hackathon.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hackathon.entities.Course;
import ru.hackathon.entities.Track;
import ru.hackathon.services.CourseService;
import ru.hackathon.services.repo.CourseRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service("courseService")
@Transactional
@Repository
public class CourseServiceImpl implements CourseService {

    private CourseRepo courseRepo;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Course> getByTrack(Track track) {
        return (List<Course>) entityManager.createQuery("select c from Course c where c.track = '" + track.getId() + "'").getResultList();
    }

    public Course getOne(Long id) {
        return courseRepo.findOne(id);
    }

    @Autowired
    public void setCourseRepo(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }
}
