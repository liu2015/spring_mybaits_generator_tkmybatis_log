package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "permission_t")
public class PermissionT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private List<RoleT> roles;

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
     * @return roles
     */
    public List<RoleT> getRoles() {
        return roles;
    }

    /**
     * @param roles
     */
    public void setRoles(List<RoleT> roles) {
        this.roles = roles;
    }
}