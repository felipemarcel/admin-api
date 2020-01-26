package com.bdados.adminapi.consumer.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConsumerType {
    WEB_CRAWLER("web-crawler"),
    API("api");

    public String value;

    ConsumerType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
