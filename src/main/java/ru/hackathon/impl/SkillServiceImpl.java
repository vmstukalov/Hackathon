package ru.hackathon.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hackathon.entities.Skill;
import ru.hackathon.services.SkillService;
import ru.hackathon.services.repo.SkillRepo;

@Service("skillService")
@Transactional
@Repository
public class SkillServiceImpl implements SkillService {

    private SkillRepo skillRepo;

    public Skill getById(Long id) {
        return skillRepo.findOne(id);
    }

    @Autowired
    public void setSkillRepo(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }
}
