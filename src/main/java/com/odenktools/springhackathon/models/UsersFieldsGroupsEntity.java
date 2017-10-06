package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_fields_groups", schema = "tingtong", catalog = "")
public class UsersFieldsGroupsEntity {
    private int idGroupField;
    private String groupName;
    private String groupDescription;
    private byte groupOrder;
    private byte isActive;
    private byte adminUseOnly;
    private byte isBuiltin;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id_group_field", nullable = false)
    public int getIdGroupField() {
        return idGroupField;
    }

    public void setIdGroupField(int idGroupField) {
        this.idGroupField = idGroupField;
    }

    @Basic
    @Column(name = "group_name", nullable = false, length = 50)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "group_description", nullable = true, length = -1)
    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    @Basic
    @Column(name = "group_order", nullable = false)
    public byte getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(byte groupOrder) {
        this.groupOrder = groupOrder;
    }

    @Basic
    @Column(name = "is_active", nullable = false)
    public byte getIsActive() {
        return isActive;
    }

    public void setIsActive(byte isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "admin_use_only", nullable = false)
    public byte getAdminUseOnly() {
        return adminUseOnly;
    }

    public void setAdminUseOnly(byte adminUseOnly) {
        this.adminUseOnly = adminUseOnly;
    }

    @Basic
    @Column(name = "is_builtin", nullable = false)
    public byte getIsBuiltin() {
        return isBuiltin;
    }

    public void setIsBuiltin(byte isBuiltin) {
        this.isBuiltin = isBuiltin;
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

        UsersFieldsGroupsEntity that = (UsersFieldsGroupsEntity) o;

        if (idGroupField != that.idGroupField) return false;
        if (groupOrder != that.groupOrder) return false;
        if (isActive != that.isActive) return false;
        if (adminUseOnly != that.adminUseOnly) return false;
        if (isBuiltin != that.isBuiltin) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
        if (groupDescription != null ? !groupDescription.equals(that.groupDescription) : that.groupDescription != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGroupField;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (groupDescription != null ? groupDescription.hashCode() : 0);
        result = 31 * result + (int) groupOrder;
        result = 31 * result + (int) isActive;
        result = 31 * result + (int) adminUseOnly;
        result = 31 * result + (int) isBuiltin;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        return result;
    }
}
