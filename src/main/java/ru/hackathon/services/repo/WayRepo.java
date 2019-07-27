package ru.hackathon.services.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hackathon.entities.Way;

public interface WayRepo extends CrudRepository<Way, Long> {
}
