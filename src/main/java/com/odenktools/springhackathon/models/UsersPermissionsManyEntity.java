package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_permissions_many", schema = "tingtong", catalog = "")
public class UsersPermissionsManyEntity {
    private int idUserPerm;
    private int roleId;
    private int permId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id_user_perm", nullable = false)
    public int getIdUserPerm() {
        return idUserPerm;
    }

    public void setIdUserPerm(int idUserPerm) {
        this.idUserPerm = idUserPerm;
    }

    @Basic
    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "perm_id", nullable = false)
    public int getPermId() {
        return permId;
    }

    public void setPermId(int permId) {
        this.permId = permId;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersPermissionsManyEntity that = (UsersPermissionsManyEntity) o;

        if (idUserPerm != that.idUserPerm) return false;
        if (roleId != that.roleId) return false;
        if (permId != that.permId) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUserPerm;
        result = 31 * result + roleId;
        result = 31 * result + permId;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
