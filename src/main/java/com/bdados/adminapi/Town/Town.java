package com.bdados.adminapi.Town;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Getter
@Setter
@Document(collection = "towns")
public class Town {

    @Id
    private String id;

    private String town;
    private String telephone;

    @Field(value = "town_urls")
    @JsonProperty(value = "town_urls")
    private TownUrl townUrls;

    public Town() {
    }

    public Town(String town, String telephone, TownUrl townUrlId) {
        this.town = town;
        this.telephone = telephone;
        this.townUrls = townUrlId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town1 = (Town) o;
        return Objects.equals(id, town1.id) &&
                Objects.equals(town, town1.town) &&
                Objects.equals(telephone, town1.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, town, telephone);
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
