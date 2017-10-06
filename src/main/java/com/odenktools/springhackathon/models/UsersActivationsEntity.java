package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_activations", schema = "tingtong", catalog = "")
public class UsersActivationsEntity {
    private int idActivation;
    private String activationCode;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id_activation", nullable = false)
    public int getIdActivation() {
        return idActivation;
    }

    public void setIdActivation(int idActivation) {
        this.idActivation = idActivation;
    }

    @Basic
    @Column(name = "activation_code", nullable = false, length = 100)
    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
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

        UsersActivationsEntity that = (UsersActivationsEntity) o;

        if (idActivation != that.idActivation) return false;
        if (activationCode != null ? !activationCode.equals(that.activationCode) : that.activationCode != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idActivation;
        result = 31 * result + (activationCode != null ? activationCode.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
