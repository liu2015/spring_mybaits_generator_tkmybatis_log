package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "role_t")
public class RoleT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String role;

    private List<RolePermissionT> permissions;

    private String users;



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
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return permissions
     */
    public List<RolePermissionT> getPermissions() {
        return permissions;
    }

    /**
     * @param permissions
     */
    public void setPermissions(List<RolePermissionT> permissions) {
        this.permissions = permissions;
    }

    /**
     * @return users
     */
    public String getUsers() {
        return users;
    }

    /**
     * @param users
     */
    public void setUsers(String users) {
        this.users = users;
    }
}