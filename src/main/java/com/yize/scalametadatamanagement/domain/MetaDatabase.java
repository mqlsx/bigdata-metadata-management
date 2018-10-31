package com.yize.scalametadatamanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Define database meta data
 */
@Entity
@Table
public class MetaDatabase {

    @Id
    @GeneratedValue
    /** Database id */
    private Integer id;

    /** Database name */
    private String name;

    /** Location to store database*/
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
