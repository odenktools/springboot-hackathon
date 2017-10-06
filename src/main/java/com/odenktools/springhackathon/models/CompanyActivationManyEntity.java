package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "company_activation_many", schema = "tingtong", catalog = "")
public class CompanyActivationManyEntity {
    private int idActivation;
    private int companyId;
    private int activationId;
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
    @Column(name = "company_id", nullable = false)
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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

        CompanyActivationManyEntity that = (CompanyActivationManyEntity) o;

        if (idActivation != that.idActivation) return false;
        if (companyId != that.companyId) return false;
        if (activationId != that.activationId) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idActivation;
        result = 31 * result + companyId;
        result = 31 * result + activationId;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
