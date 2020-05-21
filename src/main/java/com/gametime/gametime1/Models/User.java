package com.gametime.gametime1.Models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @NotNull
    @Size(min = 8, message = "Minimum password length: 8 characters")
    @Column(name = "password", length = 500)
    private String password;

    @NotNull
    @Size(max = 50)
    @Column(name = "username")
    private String username;


    public Long getId() {
        return id;
    }

    @NotNull
    @Size(max = 200, message = "Maximum email length: 200 characters")
    @Column(name = "email", length = 200)
    private String email;

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() { return email; }

    public void setEmail (String email) { this.email = email; }

}
