package com.msmavas.speedy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msmavas.speedy.models.User;
import com.msmavas.speedy.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(int id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        if (userDetails.getName() != null) {
            user.setName(userDetails.getName());
        }
        if (userDetails.getShortBio() != null) {
            user.setShortBio(userDetails.getShortBio());
        }
        if (userDetails.getAboutMe() != null) {
            user.setAboutMe(userDetails.getAboutMe());
        }
        if (userDetails.getWebsite() != null) {
            user.setWebsite(userDetails.getWebsite());
        }
        if (userDetails.getProfilePhoto() != null) {
            user.setProfilePhoto(userDetails.getProfilePhoto());
        }
        if (userDetails.getEmail() != null) {
            user.setEmail(userDetails.getEmail());
        }
        if (userDetails.getMobile() != null) {
            user.setMobile(userDetails.getMobile());
        }
        if (userDetails.getGender() != null) {
            user.setGender(userDetails.getGender());
        }
        if (userDetails.getDateOfBirth() != null) {
            user.setDateOfBirth(userDetails.getDateOfBirth());
        }
        if (userDetails.getCity() != null) {
            user.setCity(userDetails.getCity());
        }
        if (userDetails.getLocation() != null) {
            user.setLocation(userDetails.getLocation());
        }
        if (userDetails.getPassword() != null) {
            user.setPassword(userDetails.getPassword());
        }

        return userRepository.save(user);
    }
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public User login(String identifier, String password) {
        return userRepository.findByEmailOrMobileAndPassword(identifier, password)
            .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }
}
