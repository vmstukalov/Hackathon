package ru.hackathon.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hackathon.entities.Track;
import ru.hackathon.entities.Way;
import ru.hackathon.services.TrackService;
import ru.hackathon.services.repo.TrackRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service("trackService")
@Transactional
@Repository
public class TrackServiceImpl implements TrackService {

    private TrackRepo trackRepo;

    @PersistenceContext
    private EntityManager entityManager;

    public Track getById(Long id) {
        return trackRepo.findOne(id);
    }

    public List<Track> getAll() {
        return null;
    }

    public List<Track> getByWay(Way way) {
        return (List<Track>) entityManager.createQuery("select t from Track t where t.way = '" + way.getId() + "'").getResultList();
    }

    @Autowired
    public void setTrackRepo(TrackRepo trackRepo) {
        this.trackRepo = trackRepo;
    }
}
