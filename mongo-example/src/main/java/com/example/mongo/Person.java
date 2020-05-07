package com.example.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Address address;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Address {
        String zipCode, city, street;
    }


}
