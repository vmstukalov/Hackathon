package ru.hackathon.services.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hackathon.entities.Interest;

public interface InterestRepo extends CrudRepository<Interest, Long> {
}
