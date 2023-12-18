package com.cando.uni.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "person_sec")
    @SequenceGenerator(name = "person_sec", sequenceName = "person_sec", allocationSize = 10000)
    private Long id;
    @Enumerated(EnumType.STRING)
    private PersonType personType;
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String phone;
    private int age;
}