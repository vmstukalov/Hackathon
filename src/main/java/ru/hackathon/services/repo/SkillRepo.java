package ru.hackathon.services.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hackathon.entities.Skill;

public interface SkillRepo extends CrudRepository<Skill, Long> {
}
