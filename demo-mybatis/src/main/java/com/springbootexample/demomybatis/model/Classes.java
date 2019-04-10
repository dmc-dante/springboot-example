package com.springbootexample.demomybatis.model;

public class Classes {
    private Integer id;

    private String name;

    private Integer managerTeacherId;

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
        this.name = name == null ? null : name.trim();
    }

    public Integer getManagerTeacherId() {
        return managerTeacherId;
    }

    public void setManagerTeacherId(Integer managerTeacherId) {
        this.managerTeacherId = managerTeacherId;
    }
}