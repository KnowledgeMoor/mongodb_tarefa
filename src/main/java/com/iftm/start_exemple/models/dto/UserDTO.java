package com.iftm.start_exemple.models.dto;

import java.io.Serializable;

import com.iftm.start_exemple.models.Address;
import com.iftm.start_exemple.models.User;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserDTO implements Serializable {
    
    private String id;
    private String name;
    private int age;
    private Address address;

    public UserDTO() {
    }
    public UserDTO(User user) {
        this.id = user.getId().toString();
        this.name = user.getName();
        this.age = user.getAge();
        this.address = user.getAddress();
    }    
    
    public UserDTO(String name, int age){
        this.name = name;
        this.age = age;
    }
}
