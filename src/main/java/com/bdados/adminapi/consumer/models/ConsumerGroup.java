package com.bdados.adminapi.consumer.models;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConsumerGroup {
    ASPEC("aspec"),
    PRONIM("pronim"),
    PORTAL_API("portal-api"),
    PORTAL_FORTALEZA("portal-fortaleza");

    public String value;

    ConsumerGroup(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
