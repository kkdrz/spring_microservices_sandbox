package com.drozd.hello_world_microservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HelloWorldEntity {

    @Id
    @GeneratedValue
    long id;

    String someText;

}
