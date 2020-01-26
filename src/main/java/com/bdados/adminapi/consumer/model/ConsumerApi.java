package com.bdados.adminapi.consumer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ConsumerApi {

    @Id
    private String id;

    @NotBlank(message = "Url do consumidor deve ser informada.")
    private String url;

    @NotBlank(message = "A versão do consumidor deve ser informada.")
    private String version;

    @NotNull(message = "O tipo de consumidor deve ser informado.")
    private ConsumerType type;

    @NotNull(message = "O grupo do consumidor deve ser informado.")
    private ConsumerGroup group;

    public ConsumerApi() {
    }

    public ConsumerApi(String url, String version, ConsumerType type, ConsumerGroup group) {
        this.url = url;
        this.version = version;
        this.type = type;
        this.group = group;
    }
}
