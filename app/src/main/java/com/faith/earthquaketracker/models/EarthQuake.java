package com.faith.earthquaketracker.models;

//Mbatha Faith S1803443

//model class to store data
public class EarthQuake {

    //defining variables
    public final String title;
    public final String link;
    public final String category;
    public final String pubDate;
    public final String longtd;
    public final String lat;
    public final String description;

    //constructor
    public EarthQuake(String title, String link, String category, String pubDate, String longtd, String lat, String description) {
        this.title = title;
        this.link = link;
        this.category = category;
        this.pubDate = pubDate;
        this.longtd = longtd;
        this.lat = lat;
        this.description = description;
    }

    //getters and setters to retrieve and set data

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getCategory() {
        return category;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getLongtd() {
        return longtd;
    }

    public String getLat() {
        return lat;
    }

    public String getDescription() {
        return description;
    }
}
