package com.cmgg919.boardserver.service;

import com.cmgg919.boardserver.dto.UserDTO;

public interface UserService {

    void register(UserDTO userProfile);

    UserDTO login(String id, String password);

    boolean isDuplicate(String id, String password);

    UserDTO getUserInfo(String userId);

    void updatePassword(String id, String newPassword, String afterPassword);

    void deletedId(String id, String password);
}
