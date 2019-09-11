package com.example.myexample1.controller;

import com.example.myexample1.domain.Person;
import com.example.myexample1.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/neo4j")
public class SampleController {

    private HelloWorldService helloWorldService;

    @Autowired
    public SampleController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }

    @GetMapping("/search")
    public List<Person> search(){
        return helloWorldService.search();
    }

    @GetMapping("/query")
    public List<Person> whoILikes(@RequestParam(name = "name")String name){
        return helloWorldService.personILikes(name);
    }
}
