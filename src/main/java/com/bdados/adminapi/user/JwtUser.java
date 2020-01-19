package com.bdados.adminapi.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY;

@Data
@Document(collection = "users")
public class JwtUser {

    @Id
    public String id;

    public String userName;

    @JsonProperty(access = WRITE_ONLY)
    public String password;
    public String email;


    public JwtUser() {

    }

    public JwtUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
