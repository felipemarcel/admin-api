package com.bdados.adminapi.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class JwtUser {

    @Id
    public String id;

    public String userName;
    public String password;

    public JwtUser() {

    }

    public JwtUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
