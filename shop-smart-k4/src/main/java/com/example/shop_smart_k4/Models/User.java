package com.example.shop_smart_k4.Models;

import com.example.shop_smart_k4.enuk.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class User {
  
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    private Long id;

    private String username;

    private String email;

    private String password;


    @Enumerated(EnumType.STRING)

    private Role role;

    
}
