package com.hendisantika.springbootrestapipostgresql.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Comuna {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private String status;
    private Long day;
    private String url;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "clima")
    @Column(name = "detallesClima")
    private List<String> climas = new ArrayList<>();


    public Comuna(String name, String description, List<String> climas) {
        this.name = name;
        this.description = description;
        this.climas = climas;
    }

    public Comuna() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<String> getClimas() {
        return climas;
    }

    public void setClimas(List<String> climas) {
        this.climas = climas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", url='" + url + '\'' +
                ", day='" + day + '\'' +
                ", tags=" + climas +
                '}';
    }
}
