package com.example.mongo.person;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public Collection<Person> findAllPatron() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person findOne(@PathVariable String id) {
        return personRepository.findById(id).get();
    }

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/lastName/{lastName}")
    public Collection<NamesOnly> findByLastName(@PathVariable(name = "lastName") String lastName) {
        return personRepository.findByLastName(lastName);
    }
}
