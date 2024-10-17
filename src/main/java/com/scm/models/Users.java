package com.scm.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name="users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name="user_name",nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    private String about;
    private String profileImage;
    private boolean enabled =false;
    private boolean emailVerified =false;
    private boolean phoneVerified =false;

    private Providers provider = Providers.SELF;
    private String providerUserId;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = true)
    private List<Contacts> contacts;

}
