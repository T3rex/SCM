package com.scm.models;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

@Entity
@Data
public class SocialLinks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String link;
    @ManyToOne
    private Contacts contact;
}
