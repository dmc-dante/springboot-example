package com.example.mybatis.sys.entity;

import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author duke duge
 * @since 2019-04-12
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 出生日期
     */
    private LocalDate birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name=" + name +
        ", birthday=" + birthday +
        "}";
    }
}
