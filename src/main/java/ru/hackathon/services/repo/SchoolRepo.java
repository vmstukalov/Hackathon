package ru.hackathon.services.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hackathon.entities.School;

public interface SchoolRepo extends CrudRepository<School, Long> {
}
