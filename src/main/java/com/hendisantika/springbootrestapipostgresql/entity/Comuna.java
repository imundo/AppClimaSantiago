package com.hendisantika.springbootrestapipostgresql.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String status;
    private String location;
    private String url;
    private Double tempmin;
    private Double tempmax;
    private String unit;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "day")
    @Column(name = "Value")
    private List<String> days = new ArrayList<>();



    public Comuna(String status, String location, String url, Double tempmin, Double tempmax, List<String> days) {
        this.status = status;
        this.url = url;
        this.location = location;
        this.tempmin = tempmin;
        this.tempmax = tempmax;
        this.days = days;

    }

    public Comuna() {
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getTempmin() {
        return tempmin;
    }

    public void setTempmin(Double tempmin) {
        this.tempmin = tempmin;
    }

    public Double getTempmax() {
        return tempmax;
    }

    public void setTempmax(Double tempmax) {
        this.tempmax = tempmax;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<String> getDays() {
        return days;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Comuna{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", url='" + url + '\'' +
                ", days="  + days +
                '}';
    }
}
