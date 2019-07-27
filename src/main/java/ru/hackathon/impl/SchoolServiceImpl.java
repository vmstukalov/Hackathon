package ru.hackathon.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hackathon.entities.School;
import ru.hackathon.services.SchoolService;
import ru.hackathon.services.repo.SchoolRepo;

@Service("schoolService")
@Transactional
@Repository
public class SchoolServiceImpl implements SchoolService {

    private SchoolRepo schoolRepo;

    public School getById(Long id) {
        return schoolRepo.findOne(id);
    }

    @Autowired
    public void setSchoolRepo(SchoolRepo schoolRepo) {
        this.schoolRepo = schoolRepo;
    }
}
