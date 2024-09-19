package com.opitral.bytecloud.service.impl;

import com.opitral.bytecloud.domain.entity.UserEntity;
import com.opitral.bytecloud.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity registerUser(UserEntity user) {
        return null;
    }

    @Override
    public Optional<UserEntity> getUserById(Long userId) {
        return Optional.empty();
    }

    @Override
    public Optional<UserEntity> getUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public boolean changePassword(Long userId, String oldPassword, String newPassword) {
        return false;
    }

    @Override
    public void resetPassword(String email) {

    }

    @Override
    public void activateUser(Long userId) {

    }

    @Override
    public void deactivateUser(Long userId) {

    }
}
