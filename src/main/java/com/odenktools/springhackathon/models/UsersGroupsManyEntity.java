package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_groups_many", schema = "tingtong", catalog = "")
public class UsersGroupsManyEntity {
    private int idUserRoles;
    private int userId;
    private int groupId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id_user_roles", nullable = false)
    public int getIdUserRoles() {
        return idUserRoles;
    }

    public void setIdUserRoles(int idUserRoles) {
        this.idUserRoles = idUserRoles;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "group_id", nullable = false)
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
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

        UsersGroupsManyEntity that = (UsersGroupsManyEntity) o;

        if (idUserRoles != that.idUserRoles) return false;
        if (userId != that.userId) return false;
        if (groupId != that.groupId) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUserRoles;
        result = 31 * result + userId;
        result = 31 * result + groupId;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
