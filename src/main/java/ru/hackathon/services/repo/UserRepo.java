package ru.hackathon.services.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hackathon.entities.User;

public interface UserRepo extends CrudRepository<User, Long> {
}
