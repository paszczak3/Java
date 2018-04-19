package com.faustit.zadaniedlakandydatow.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class UserGroup implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "userGroup", fetch = FetchType.EAGER)
    private List<User> users;


    public UserGroup() {
    }


    public UserGroup(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public User geteUser(int index){
        return this.users.get(index);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void  addUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
