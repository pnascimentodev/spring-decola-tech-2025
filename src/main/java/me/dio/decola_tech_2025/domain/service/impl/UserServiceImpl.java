package me.dio.decola_tech_2025.domain.service.impl;

import me.dio.decola_tech_2025.domain.model.User;
import me.dio.decola_tech_2025.domain.repository.UserRepository;
import me.dio.decola_tech_2025.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public  class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public User update(User userToUpdate) {
        return userRepository.save(userToUpdate);
    }

}