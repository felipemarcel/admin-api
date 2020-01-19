package com.bdados.adminapi.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService service;

    @RequestMapping("/consumer-types")
    public List<String> findAllTypes() {
        return service.findAllTypes().toJavaList();
    }

    @RequestMapping("/consumer-groups")
    public List<String> findAllGroups() {
        return service.findAllGroups().toJavaList();
    }
}
