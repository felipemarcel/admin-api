package com.bdados.adminapi.user;

import java.util.ArrayList;
import java.util.List;

import io.vavr.control.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        JwtUser jwtUser = Option.of(findBy(username)).getOrElseThrow(() -> {
            throw new UsernameNotFoundException("User not found with username: " + username);
        });
        return new User(jwtUser.userName, jwtUser.password, new ArrayList<>());
    }

    public JwtUser findBy(String username) {
        return repository.findByUserName(username);
    }

    public List<JwtUser> findAll() {
        return repository.findAll();
    }

    public JwtUser saveOrUpdate(JwtUser user) {
        return repository.save(user);
    }

    public void remove(String id) {
        repository.deleteById(id);
    }

}