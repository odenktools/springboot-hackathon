package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_permissions", schema = "tingtong", catalog = "")
public class UsersPermissionsEntity {
    private int idPerm;
    private String namePermission;
    private String readableName;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id_perm", nullable = false)
    public int getIdPerm() {
        return idPerm;
    }

    public void setIdPerm(int idPerm) {
        this.idPerm = idPerm;
    }

    @Basic
    @Column(name = "name_permission", nullable = false, length = 50)
    public String getNamePermission() {
        return namePermission;
    }

    public void setNamePermission(String namePermission) {
        this.namePermission = namePermission;
    }

    @Basic
    @Column(name = "readable_name", nullable = false, length = 50)
    public String getReadableName() {
        return readableName;
    }

    public void setReadableName(String readableName) {
        this.readableName = readableName;
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

        UsersPermissionsEntity that = (UsersPermissionsEntity) o;

        if (idPerm != that.idPerm) return false;
        if (namePermission != null ? !namePermission.equals(that.namePermission) : that.namePermission != null)
            return false;
        if (readableName != null ? !readableName.equals(that.readableName) : that.readableName != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPerm;
        result = 31 * result + (namePermission != null ? namePermission.hashCode() : 0);
        result = 31 * result + (readableName != null ? readableName.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        return result;
    }
}
