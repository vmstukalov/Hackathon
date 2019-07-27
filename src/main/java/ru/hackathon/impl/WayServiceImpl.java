package ru.hackathon.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hackathon.entities.Interest;
import ru.hackathon.entities.Way;
import ru.hackathon.services.WayService;
import ru.hackathon.services.repo.WayRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service("wayService")
@Repository
@Transactional
public class WayServiceImpl implements WayService {

    private WayRepo wayRepo;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Way> getWaysByInterests(List<Long> interests) {

        List<Way> ways = new ArrayList<Way>();

        for (Long id : interests) {
            ways.add(wayRepo.findOne(id));
        }

        return ways;
    }

    public List<Way> getWaysByInterestName(String name) {
        System.out.println(name);
        System.out.println(name.equals("Программист"));
        return (List<Way>) entityManager.createQuery("select w from Way w where w.name = 'Программист'").getResultList();
    }

    public List<Way> getWaysByInterest(Interest interest) {
        return (List<Way>) entityManager.createQuery("select w from Way w where w.interest = '" + interest.getId() + "'").getResultList();
    }



    public Way getById(Long id) {
        return wayRepo.findOne(id);
    }

    @Autowired
    public void setWayRepo(WayRepo wayRepo) {
        this.wayRepo = wayRepo;
    }
}
