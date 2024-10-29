package com.iftm.start_exemple.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Document(collection = "user")
public class User {
    
    @Id
    private ObjectId id;
    @Field("name")
    private String name;
    private int age;
    private Address address;

    public User() {
    }

    public User(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
