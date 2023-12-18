package com.cando.uni.repository;

import com.cando.uni.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "person", collectionResourceRel = "person")
public interface PersonRepository extends JpaRepository<Person, Long> {
}
