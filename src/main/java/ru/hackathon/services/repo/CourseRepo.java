package ru.hackathon.services.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hackathon.entities.Course;

public interface CourseRepo extends CrudRepository<Course, Long> {
}
