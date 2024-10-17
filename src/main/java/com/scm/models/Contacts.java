package com.scm.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "contacts")
@Data
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String image;
    private String description;
    private boolean favourite=false;
    private String weblink;
    @ManyToOne
    private Users user;
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = true)
    private List<SocialLinks> links;

}
