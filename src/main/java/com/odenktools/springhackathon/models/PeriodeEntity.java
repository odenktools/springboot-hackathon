package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "periode", schema = "tingtong", catalog = "")
public class PeriodeEntity {
    private int idPeriode;
    private String codePeriode;
    private String namaPeriode;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id_periode", nullable = false)
    public int getIdPeriode() {
        return idPeriode;
    }

    public void setIdPeriode(int idPeriode) {
        this.idPeriode = idPeriode;
    }

    @Basic
    @Column(name = "code_periode", nullable = false, length = 100)
    public String getCodePeriode() {
        return codePeriode;
    }

    public void setCodePeriode(String codePeriode) {
        this.codePeriode = codePeriode;
    }

    @Basic
    @Column(name = "nama_periode", nullable = false, length = 100)
    public String getNamaPeriode() {
        return namaPeriode;
    }

    public void setNamaPeriode(String namaPeriode) {
        this.namaPeriode = namaPeriode;
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

    @Basic
    @Column(name = "deleted_at", nullable = true)
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PeriodeEntity that = (PeriodeEntity) o;

        if (idPeriode != that.idPeriode) return false;
        if (codePeriode != null ? !codePeriode.equals(that.codePeriode) : that.codePeriode != null) return false;
        if (namaPeriode != null ? !namaPeriode.equals(that.namaPeriode) : that.namaPeriode != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPeriode;
        result = 31 * result + (codePeriode != null ? codePeriode.hashCode() : 0);
        result = 31 * result + (namaPeriode != null ? namaPeriode.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        return result;
    }
}
