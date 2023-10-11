package com.nagata.liveos.dto;

import jakarta.validation.constraints.NotEmpty;
public class UserDTO {

    @NotEmpty
    String name;
    @NotEmpty
    String nickname;

    public String getName(){
        return this.name;
    }

    public String getNickname(){
        return this.nickname;
    }
}
