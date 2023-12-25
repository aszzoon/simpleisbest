package com.example.blog.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddUserRequest {
    private Long id;
    private String email;
    private String password;
}
