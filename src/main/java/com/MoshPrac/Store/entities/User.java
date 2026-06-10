package com.MoshPrac.Store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Address> addresses = new ArrayList<>();

    private void addAddress(Address address) {
        addresses.add(address);
        address.setUser(this);
    }

    private void removeAddress(Address address) {
        addresses.remove(address);
        address.setUser(null);
    }
}
