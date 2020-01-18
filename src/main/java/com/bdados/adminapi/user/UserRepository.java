package com.bdados.adminapi.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<JwtUser, String> {
    JwtUser findByUserName(String userName);
}
