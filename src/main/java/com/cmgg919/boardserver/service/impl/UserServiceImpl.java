package com.cmgg919.boardserver.service.impl;

import com.cmgg919.boardserver.Exception.DuplicateIdException;
import com.cmgg919.boardserver.dto.UserDTO;
import com.cmgg919.boardserver.mapper.UserProfileMapper;
import com.cmgg919.boardserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import static com.cmgg919.boardserver.util.SHA256Util.encryptSHA256;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserProfileMapper userProfileMapper;

    public UserServiceImpl(UserProfileMapper userProfileMapper) {
        this.userProfileMapper = userProfileMapper;
    }

    @Override
    public void register(UserDTO userProfile) {
        boolean duplIdResult = isDuplicatedId(userProfile.getUserID());
        if(duplIdResult) {
            throw new DuplicateIdException("This id is duplicated");
        }
        userProfile.setCreateTime(new java.util.Date());
        userProfile.setPassword(encryptSHA256(userProfile.getPassword()));
    }

    private boolean isDuplicatedId(String userID) {
        return false;
    }

    @Override
    public UserDTO login(String id, String password) {
        return null;
    }

    @Override
    public boolean isDuplicate(String id, String password) {
        return false;
    }

    @Override
    public UserDTO getUserInfo(String userId) {
        return null;
    }

    @Override
    public void updatePassword(String id, String newPassword, String afterPassword) {

    }

    @Override
    public void deletedId(String id, String password) {

    }
}
