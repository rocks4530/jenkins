package com.awesome.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "person")
public class Employee {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter 
    @Setter
    private Long id;
 
    @Size(min = 3, max = 20)
    @Getter 
    @Setter
    private String name;
 
}
