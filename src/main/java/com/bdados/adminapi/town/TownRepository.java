package com.bdados.adminapi.town;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends MongoRepository<Town, String> {
}
