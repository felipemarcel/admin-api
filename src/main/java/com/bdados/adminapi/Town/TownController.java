package com.bdados.adminapi.Town;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import static io.vavr.API.*;
import static io.vavr.Predicates.*;
import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/towns")
public class TownController {

    @Autowired
    private TownService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ok(service.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody Town town) throws URISyntaxException {
        Town createdTown = service.save(town);
        return created(new URI(createdTown.getId())).build();
    }

    @GetMapping(path = "/:id")
    public ResponseEntity<?> findBy(String id) {
        Town t = service.findBy(id).getOrElseThrow(RuntimeException::new);
        return ok(t);
    }
}
