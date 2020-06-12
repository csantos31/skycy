package com.idemia.skycy.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SKYResponse {
    @SerializedName("title")
    private String title;
    @SerializedName("overview")
    private String overview;
    @SerializedName("duration")
    private String duration;
    @SerializedName("release_year")
    private String release_year;
    @SerializedName("cover_url")
    private String cover_url;
    @SerializedName("id")
    private String id;
    @SerializedName("backdrops_url")
    private List<String> backdrops_url;

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getDuration() {
        return duration;
    }

    public String getRelease_year() {
        return release_year;
    }

    public String getCover_url() {
        return cover_url;
    }

    public String getId() {
        return id;
    }

    public List<String> getBackdrops_url() {
        return backdrops_url;
    }
}
