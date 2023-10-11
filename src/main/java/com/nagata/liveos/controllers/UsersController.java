package com.nagata.liveos.controllers;

import com.nagata.liveos.dto.UserDTO;
import com.nagata.liveos.exception.ResponseHandler;
import com.nagata.liveos.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;
    @GetMapping("hello")
    public ResponseEntity<String> helloWorld(@Valid @RequestBody UserDTO userDTO){
        var result = userService.createUser(userDTO);
        return ResponseEntity.ok().body(ResponseHandler.response(result).toString());
    }
}
