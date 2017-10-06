package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "field_types", schema = "tingtong", catalog = "")
public class FieldTypesEntity {
    private int idFieldType;
    private String fieldName;
    private String codeFieldTypes;
    private String fieldDescription;
    private int fieldSize;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id_field_type", nullable = false)
    public int getIdFieldType() {
        return idFieldType;
    }

    public void setIdFieldType(int idFieldType) {
        this.idFieldType = idFieldType;
    }

    @Basic
    @Column(name = "field_name", nullable = false, length = 128)
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Basic
    @Column(name = "code_field_types", nullable = false, length = 128)
    public String getCodeFieldTypes() {
        return codeFieldTypes;
    }

    public void setCodeFieldTypes(String codeFieldTypes) {
        this.codeFieldTypes = codeFieldTypes;
    }

    @Basic
    @Column(name = "field_description", nullable = true, length = -1)
    public String getFieldDescription() {
        return fieldDescription;
    }

    public void setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
    }

    @Basic
    @Column(name = "field_size", nullable = false)
    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
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

        FieldTypesEntity that = (FieldTypesEntity) o;

        if (idFieldType != that.idFieldType) return false;
        if (fieldSize != that.fieldSize) return false;
        if (fieldName != null ? !fieldName.equals(that.fieldName) : that.fieldName != null) return false;
        if (codeFieldTypes != null ? !codeFieldTypes.equals(that.codeFieldTypes) : that.codeFieldTypes != null)
            return false;
        if (fieldDescription != null ? !fieldDescription.equals(that.fieldDescription) : that.fieldDescription != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFieldType;
        result = 31 * result + (fieldName != null ? fieldName.hashCode() : 0);
        result = 31 * result + (codeFieldTypes != null ? codeFieldTypes.hashCode() : 0);
        result = 31 * result + (fieldDescription != null ? fieldDescription.hashCode() : 0);
        result = 31 * result + fieldSize;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        return result;
    }
}
