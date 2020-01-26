package com.bdados.adminapi.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY;

@Data
@Document(collection = "users")
public class JwtUser {

    @Id
    public String id;

    @Field(value = "username")
    @JsonProperty(value = "username")
    @NotBlank(message = "Campo 'Nome de usuário' deve ser preenchido.")
    public String userName;

    @NotBlank(message = "Campo senha deve ser preenchido.")
    @JsonProperty(access = WRITE_ONLY)
    public String password;

    @NotBlank(message = "Campo email deve ser preenchido")
    public String email;


    public JwtUser() {

    }

    public JwtUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
