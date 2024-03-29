package com.estsoft.user.entity;

import com.estsoft.user.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "usertable")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false,length = 100)
    private String name;
    @Column(unique = true, nullable = false,length = 100)
    private String password;
    @Column(nullable = false,length = 100)
    private String email;
    @Column(nullable = false,length = 10)
    private String grade;
    @Column
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now(); // 엔티티가 영속화되기 전에 createdAt 필드를 현재 시간으로 설정
    }

    public static UserEntity toUserEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setName(userDTO.getName());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setGrade(userDTO.getGrade());
        userEntity.setCreatedAt(userDTO.getCreatedAt());
        return userEntity;
    }
}
