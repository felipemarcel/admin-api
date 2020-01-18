package com.bdados.adminapi.town;

import com.bdados.adminapi.consumer.models.ConsumerApi;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "towns")
public class Town {

    @Id
    private String id;

    private String town;
    private String telephone;

    @Field(value = "town_urls")
    @JsonProperty(value = "town_urls")
    private TownUrl townUrls;

    @Field(value = "consumer_apis")
    @JsonProperty(value = "consumer_apis")
    private List<ConsumerApi> consumerApis;

    public Town() {
    }

    public Town(String town, String telephone, TownUrl townUrlId) {
        this.town = town;
        this.telephone = telephone;
        this.townUrls = townUrlId;
    }

    @Override
    public String toString() {
        return "Town{" +
                "id='" + id + '\'' +
                ", town='" + town + '\'' +
                ", telephone='" + telephone + '\'' +
                ", townUrls=" + townUrls +
                '}';
    }
}
