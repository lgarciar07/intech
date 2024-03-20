package com.bci.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    private String name;
    private String lastName;
    private int age;

    @Column(unique = true)
    @Pattern(regexp = "\\d{1,8}", message = "El documento de identificación debe contener solo números y tener máximo 8 dígitos")
    private String identificationDocument;

    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$", message = "Formato de correo electrónico incorrecto")
    private String email;

    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @Valid
    private List<Phones> phones;

    private LocalDateTime created;
    private LocalDateTime modified;
    private LocalDateTime lastLogin;
    private String token;
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "nickname")
    private String nickname;

    private String createdByUser;

}