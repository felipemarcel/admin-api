package com.bdados.adminapi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ok(service.findAll());
    }

    @GetMapping("/{username}")
    public ResponseEntity<?> findBy(@PathVariable String username) {
        return ok(service.findBy(username));
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody JwtUser jwtUser) throws URISyntaxException {
        JwtUser user = service.saveOrUpdate(jwtUser);
        return created(new URI(user.getId())).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @Valid @RequestBody JwtUser jwtUser) throws URISyntaxException {
        return ok(service.saveOrUpdate(jwtUser));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remove(@PathVariable String id) {
        service.remove(id);
        return ok().build();
    }
}
