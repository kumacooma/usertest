package com.estsoft.user.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {

    private Long id;
    private String name;
    private String password;
    private String email;
    private String grade;
    private LocalDateTime createdAt;
}
