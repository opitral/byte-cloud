package com.opitral.bytecloud.service;

import com.opitral.bytecloud.domain.entity.UserEntity;

import java.util.Optional;

public interface UserService {
    UserEntity registerUser(UserEntity user);
    Optional<UserEntity> getUserById(Long userId);
    Optional<UserEntity> getUserByEmail(String email);
    UserEntity updateUser(UserEntity user);
    void deleteUser(Long userId);
    boolean changePassword(Long userId, String oldPassword, String newPassword);
    void resetPassword(String email);
    void activateUser(Long userId);
    void deactivateUser(Long userId);
}
