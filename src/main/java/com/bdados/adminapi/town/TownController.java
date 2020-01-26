package com.bdados.adminapi.town;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

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
    public ResponseEntity<?> save(@Valid @RequestBody Town town) throws URISyntaxException {
        Town createdTown = service.saveOrUpdate(town);
        return created(new URI(createdTown.getId())).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findBy(@PathVariable String id) {
        Town t = service.findBy(id).getOrElseThrow(RuntimeException::new);
        return ok(t);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @Valid @RequestBody Town town) {
        service.saveOrUpdate(town);
        return ok().build();
    }
}
