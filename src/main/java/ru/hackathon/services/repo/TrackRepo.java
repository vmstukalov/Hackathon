package ru.hackathon.services.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hackathon.entities.Track;

public interface TrackRepo extends CrudRepository<Track, Long> {
}
