package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_fields_many", schema = "tingtong", catalog = "")
public class UsersFieldsManyEntity {
    private int idRoleField;
    private int roleId;
    private int userfieldId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id_role_field", nullable = false)
    public int getIdRoleField() {
        return idRoleField;
    }

    public void setIdRoleField(int idRoleField) {
        this.idRoleField = idRoleField;
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
    @Column(name = "userfield_id", nullable = false)
    public int getUserfieldId() {
        return userfieldId;
    }

    public void setUserfieldId(int userfieldId) {
        this.userfieldId = userfieldId;
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

        UsersFieldsManyEntity that = (UsersFieldsManyEntity) o;

        if (idRoleField != that.idRoleField) return false;
        if (roleId != that.roleId) return false;
        if (userfieldId != that.userfieldId) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRoleField;
        result = 31 * result + roleId;
        result = 31 * result + userfieldId;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
