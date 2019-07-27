package ru.hackathon.impl;


import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hackathon.entities.Interest;
import ru.hackathon.entities.Way;
import ru.hackathon.services.InterestService;
import ru.hackathon.services.repo.InterestRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Transactional
@Repository
@Service("interestService")
public class InterestServiceImpl implements InterestService {

    private InterestRepo interestRepo;

    @PersistenceContext
    private EntityManager entityManager;

    public Interest save(Interest interest) {
        return interestRepo.save(interest);
    }

    public List<Interest> getAllInterests() {
        return Lists.newArrayList(interestRepo.findAll());
    }

    public Interest getById(Long id) {
        return interestRepo.findOne(id);
    }




    @Autowired
    public void setInterestRepo(InterestRepo interestRepo) {
        this.interestRepo = interestRepo;
    }
}
