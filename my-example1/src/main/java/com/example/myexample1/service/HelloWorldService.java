package com.example.myexample1.service;

import com.example.myexample1.domain.Person;
import com.example.myexample1.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class HelloWorldService {

    private final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);
    private PersonRepository personRepository;

    @Autowired
    public HelloWorldService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> search(){
        List<Person> persons = (List<Person>) personRepository.findAll();
        return persons;
    }

    public List<Person> personILikes(String myName){
        return personRepository.whoILikes(myName);
    }
}
