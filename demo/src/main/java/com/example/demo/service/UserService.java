package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

        @Autowired
        private UserRepository userRepository;

        public User createUser(User user) {
            return userRepository.save(user);
        }

        public List<User> getUsers() {
            return userRepository.findAll();
        }

        public User getUserById(Long id) {
            return userRepository.findById(id).orElse(null);
        }

        public List<User> getUserByUsername(String username){
            return userRepository.findByUsername(username);
        }

    public User updateUser(Long id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setUsername(updatedUser.getUsername());
            user.setEmail(updatedUser.getEmail());
            return userRepository.save(user);
        }).orElse(null);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
