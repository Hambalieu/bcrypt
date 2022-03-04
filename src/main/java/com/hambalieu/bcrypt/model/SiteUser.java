package com.hambalieu.bcrypt.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class SiteUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    String username;
    String password;


    @OneToMany(mappedBy = "postsOfUser", cascade = CascadeType.ALL)
    @OrderBy("text")
    List<Posts> postsOfThisUser;


    public List<Posts> getPostsOfThisUser() {
        return postsOfThisUser;
    }

    public void setPostsOfThisUser(List<Posts> postsOfThisUser) {
        this.postsOfThisUser = postsOfThisUser;
    }
    public SiteUser(){

    }

    public SiteUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
