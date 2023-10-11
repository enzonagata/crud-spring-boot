package com.nagata.liveos.service;

import com.nagata.liveos.dto.UserDTO;
import com.nagata.liveos.entities.UserEntity;
import com.nagata.liveos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    private UserRepository usersRepository;

    public UserEntity createUser(@RequestBody UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setNickname(userDTO.getNickname());
        userEntity.setName(userDTO.getName());
        return usersRepository.saveAndFlush(userEntity);
    }
}
