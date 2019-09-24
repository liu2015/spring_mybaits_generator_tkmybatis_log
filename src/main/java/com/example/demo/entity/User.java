package com.example.demo.entity;

import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String passwrod;

    private String jiaose;

    private String quanxian;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return passwrod
     */
    public String getPasswrod() {
        return passwrod;
    }

    /**
     * @param passwrod
     */
    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    /**
     * @return jiaose
     */
    public String getJiaose() {
        return jiaose;
    }

    /**
     * @param jiaose
     */
    public void setJiaose(String jiaose) {
        this.jiaose = jiaose;
    }

    /**
     * @return quanxian
     */
    public String getQuanxian() {
        return quanxian;
    }

    /**
     * @param quanxian
     */
    public void setQuanxian(String quanxian) {
        this.quanxian = quanxian;
    }
}