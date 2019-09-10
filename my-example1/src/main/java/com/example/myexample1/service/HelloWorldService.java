package com.example.myexample1.service;

import com.example.myexample1.domain.Person;
import com.example.myexample1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldService {

    private PersonRepository personRepository;

    @Autowired
    public HelloWorldService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> search(){
        List<Person> persons = (List<Person>) personRepository.findAll();
        return persons;
    }
}
