package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "api_key_users_many", schema = "tingtong", catalog = "")
public class ApiKeyUsersManyEntity {
    private int idUserKey;
    private int userId;
    private int userApiKey;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id_user_key", nullable = false)
    public int getIdUserKey() {
        return idUserKey;
    }

    public void setIdUserKey(int idUserKey) {
        this.idUserKey = idUserKey;
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
    @Column(name = "user_api_key", nullable = false)
    public int getUserApiKey() {
        return userApiKey;
    }

    public void setUserApiKey(int userApiKey) {
        this.userApiKey = userApiKey;
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

        ApiKeyUsersManyEntity that = (ApiKeyUsersManyEntity) o;

        if (idUserKey != that.idUserKey) return false;
        if (userId != that.userId) return false;
        if (userApiKey != that.userApiKey) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUserKey;
        result = 31 * result + userId;
        result = 31 * result + userApiKey;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
