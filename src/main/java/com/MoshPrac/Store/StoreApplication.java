package com.MoshPrac.Store;

import com.MoshPrac.Store.entities.Address;
import com.MoshPrac.Store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);

        var user = User.builder()
                .name("MoshPrac")
                .password("MoshPrac")
                .email("sfdf@gmail.com")
                .build();

        var address = Address.builder()
                .street("123 Main St")
                .city("Main St")
                .state("Main St")
                .zip("12345")
                .build();

        user.addAddress(address);
    }
}