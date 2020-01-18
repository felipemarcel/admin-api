package com.bdados.adminapi.consumer.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ConsumerApi {

    @Id
    private String id;

    private String url;
    private String version;
    private ConsumerType type;
    private ConsumerGroup group;
}
