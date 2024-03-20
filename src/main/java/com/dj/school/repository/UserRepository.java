package com.dj.school.repository;

import com.dj.school.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends  CrudRepository<User, Integer> {
}
