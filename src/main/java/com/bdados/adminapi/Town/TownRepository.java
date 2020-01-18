package com.bdados.adminapi.Town;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends MongoRepository<Town, String> {
}
