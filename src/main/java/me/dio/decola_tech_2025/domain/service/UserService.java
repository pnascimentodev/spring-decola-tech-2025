package me.dio.decola_tech_2025.domain.service;

import me.dio.decola_tech_2025.domain.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
    User update(User userToUpdate);
    List<User> findByAll();

}