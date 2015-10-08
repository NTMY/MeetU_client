package com.walfud.meetu.database;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "LOCATION".
 */
public class Location {

    private Long id;
    private Double longitude;
    private Double latitude;
    private String address;
    private String business;
    private java.util.Date uploadTime;
    private Long userId;

    public Location() {
    }

    public Location(Long id) {
        this.id = id;
    }

    public Location(Long id, Double longitude, Double latitude, String address, String business, java.util.Date uploadTime, Long userId) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.business = business;
        this.uploadTime = uploadTime;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public java.util.Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(java.util.Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
