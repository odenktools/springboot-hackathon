package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_activation_many", schema = "tingtong", catalog = "")
public class UsersActivationManyEntity {
    private int idUsersActivation;
    private int userId;
    private int activationId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id_users_activation", nullable = false)
    public int getIdUsersActivation() {
        return idUsersActivation;
    }

    public void setIdUsersActivation(int idUsersActivation) {
        this.idUsersActivation = idUsersActivation;
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
    @Column(name = "activation_id", nullable = false)
    public int getActivationId() {
        return activationId;
    }

    public void setActivationId(int activationId) {
        this.activationId = activationId;
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

        UsersActivationManyEntity that = (UsersActivationManyEntity) o;

        if (idUsersActivation != that.idUsersActivation) return false;
        if (userId != that.userId) return false;
        if (activationId != that.activationId) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsersActivation;
        result = 31 * result + userId;
        result = 31 * result + activationId;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
