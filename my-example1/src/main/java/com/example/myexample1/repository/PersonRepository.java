package com.example.myexample1.repository;

import com.example.myexample1.domain.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {

    @Query("MATCH (:Person {name:{0}})-[:LIKES]->(m:Person) return m")
    List<Person> whoILikes(String myName);
}
