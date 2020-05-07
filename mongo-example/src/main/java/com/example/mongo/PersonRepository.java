package com.example.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

public interface PersonRepository extends MongoRepository<Person, String> {
    Collection<NamesOnly> findByLastName(String lastName);
}

interface NamesOnly {
    String getFirstName();

    String getLastName();
}
