package com.example.demothree.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class UserEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  long id;

    @Column(name = "name")
    private  String name;

    @Column(name = "age")
    private  long age;

    @Column(name = "address")
    private  String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
