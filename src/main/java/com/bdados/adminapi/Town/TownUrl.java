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
public class TownUrl {

    @Id
    private String id;

    private String website;

    @Field("facebook_url")
    @JsonProperty(value = "facebook_url")
    private String facebookUrl;

    @Field("instagram_url")
    @JsonProperty("instagram_url")
    private String instagramUrl;

    @Field("youtube_url")
    @JsonProperty("youtube_url")
    private String youtubeUrl;

    @Field("twitter_url")
    @JsonProperty("twitter_url")
    private String twitterUrl;

    @Field("portal_t_url")
    @JsonProperty("portal_t_url")
    private String portalTUrl;

    public TownUrl() {
    }

    public TownUrl(String website, String facebookUrl, String instagramUrl, String youtubeUrl, String twitterUrl, String portalTUrl) {
        this.website = website;
        this.facebookUrl = facebookUrl;
        this.instagramUrl = instagramUrl;
        this.youtubeUrl = youtubeUrl;
        this.twitterUrl = twitterUrl;
        this.portalTUrl = portalTUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TownUrl townUrl = (TownUrl) o;
        return Objects.equals(id, townUrl.id) &&
                Objects.equals(website, townUrl.website) &&
                Objects.equals(facebookUrl, townUrl.facebookUrl) &&
                Objects.equals(instagramUrl, townUrl.instagramUrl) &&
                Objects.equals(youtubeUrl, townUrl.youtubeUrl) &&
                Objects.equals(twitterUrl, townUrl.twitterUrl) &&
                Objects.equals(portalTUrl, townUrl.portalTUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, website, facebookUrl, instagramUrl, youtubeUrl, twitterUrl, portalTUrl);
    }

    @Override
    public String toString() {
        return "TownUrl{" +
                "id='" + id + '\'' +
                ", website='" + website + '\'' +
                ", facebookUrl='" + facebookUrl + '\'' +
                ", instagramUrl='" + instagramUrl + '\'' +
                ", youtubeUrl='" + youtubeUrl + '\'' +
                ", twitterUrl='" + twitterUrl + '\'' +
                ", portalTUrl='" + portalTUrl + '\'' +
                '}';
    }
}
