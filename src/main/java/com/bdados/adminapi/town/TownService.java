package com.bdados.adminapi.town;

import io.vavr.control.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownService {

    @Autowired
    private TownRepository repository;

    public List<Town> findAll() {
        return repository.findAll();
    }

    public Town save(Town town) {
        return repository.insert(town);
    }

    public Option<Town> findBy(String id) {
        return Option.ofOptional(repository.findById(id));
    }
}
