package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_fields", schema = "tingtong", catalog = "")
public class UsersFieldsEntity {
    private int idCustomFields;
    private int fieldTypeId;
    private int groupFieldId;
    private String fieldName;
    private String fieldLabel;
    private String fieldComment;
    private String helpTextBlock;
    private String possibleValues;
    private String sortPossibleValues;
    private String textSelectValue;
    private byte isMandatory;
    private byte fieldOrder;
    private byte sortValues;
    private byte isActive;
    private byte showInSignup;
    private byte adminUseOnly;
    private byte isEncrypted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id_custom_fields", nullable = false)
    public int getIdCustomFields() {
        return idCustomFields;
    }

    public void setIdCustomFields(int idCustomFields) {
        this.idCustomFields = idCustomFields;
    }

    @Basic
    @Column(name = "field_type_id", nullable = false)
    public int getFieldTypeId() {
        return fieldTypeId;
    }

    public void setFieldTypeId(int fieldTypeId) {
        this.fieldTypeId = fieldTypeId;
    }

    @Basic
    @Column(name = "group_field_id", nullable = false)
    public int getGroupFieldId() {
        return groupFieldId;
    }

    public void setGroupFieldId(int groupFieldId) {
        this.groupFieldId = groupFieldId;
    }

    @Basic
    @Column(name = "field_name", nullable = false, length = 50)
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Basic
    @Column(name = "field_label", nullable = false, length = 50)
    public String getFieldLabel() {
        return fieldLabel;
    }

    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }

    @Basic
    @Column(name = "field_comment", nullable = true, length = -1)
    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
    }

    @Basic
    @Column(name = "help_text_block", nullable = true, length = -1)
    public String getHelpTextBlock() {
        return helpTextBlock;
    }

    public void setHelpTextBlock(String helpTextBlock) {
        this.helpTextBlock = helpTextBlock;
    }

    @Basic
    @Column(name = "possible_values", nullable = true, length = -1)
    public String getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(String possibleValues) {
        this.possibleValues = possibleValues;
    }

    @Basic
    @Column(name = "sort_possible_values", nullable = true, length = 10)
    public String getSortPossibleValues() {
        return sortPossibleValues;
    }

    public void setSortPossibleValues(String sortPossibleValues) {
        this.sortPossibleValues = sortPossibleValues;
    }

    @Basic
    @Column(name = "text_select_value", nullable = true, length = -1)
    public String getTextSelectValue() {
        return textSelectValue;
    }

    public void setTextSelectValue(String textSelectValue) {
        this.textSelectValue = textSelectValue;
    }

    @Basic
    @Column(name = "is_mandatory", nullable = false)
    public byte getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(byte isMandatory) {
        this.isMandatory = isMandatory;
    }

    @Basic
    @Column(name = "field_order", nullable = false)
    public byte getFieldOrder() {
        return fieldOrder;
    }

    public void setFieldOrder(byte fieldOrder) {
        this.fieldOrder = fieldOrder;
    }

    @Basic
    @Column(name = "sort_values", nullable = false)
    public byte getSortValues() {
        return sortValues;
    }

    public void setSortValues(byte sortValues) {
        this.sortValues = sortValues;
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
    @Column(name = "show_in_signup", nullable = false)
    public byte getShowInSignup() {
        return showInSignup;
    }

    public void setShowInSignup(byte showInSignup) {
        this.showInSignup = showInSignup;
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
    @Column(name = "is_encrypted", nullable = false)
    public byte getIsEncrypted() {
        return isEncrypted;
    }

    public void setIsEncrypted(byte isEncrypted) {
        this.isEncrypted = isEncrypted;
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

        UsersFieldsEntity that = (UsersFieldsEntity) o;

        if (idCustomFields != that.idCustomFields) return false;
        if (fieldTypeId != that.fieldTypeId) return false;
        if (groupFieldId != that.groupFieldId) return false;
        if (isMandatory != that.isMandatory) return false;
        if (fieldOrder != that.fieldOrder) return false;
        if (sortValues != that.sortValues) return false;
        if (isActive != that.isActive) return false;
        if (showInSignup != that.showInSignup) return false;
        if (adminUseOnly != that.adminUseOnly) return false;
        if (isEncrypted != that.isEncrypted) return false;
        if (fieldName != null ? !fieldName.equals(that.fieldName) : that.fieldName != null) return false;
        if (fieldLabel != null ? !fieldLabel.equals(that.fieldLabel) : that.fieldLabel != null) return false;
        if (fieldComment != null ? !fieldComment.equals(that.fieldComment) : that.fieldComment != null) return false;
        if (helpTextBlock != null ? !helpTextBlock.equals(that.helpTextBlock) : that.helpTextBlock != null)
            return false;
        if (possibleValues != null ? !possibleValues.equals(that.possibleValues) : that.possibleValues != null)
            return false;
        if (sortPossibleValues != null ? !sortPossibleValues.equals(that.sortPossibleValues) : that.sortPossibleValues != null)
            return false;
        if (textSelectValue != null ? !textSelectValue.equals(that.textSelectValue) : that.textSelectValue != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCustomFields;
        result = 31 * result + fieldTypeId;
        result = 31 * result + groupFieldId;
        result = 31 * result + (fieldName != null ? fieldName.hashCode() : 0);
        result = 31 * result + (fieldLabel != null ? fieldLabel.hashCode() : 0);
        result = 31 * result + (fieldComment != null ? fieldComment.hashCode() : 0);
        result = 31 * result + (helpTextBlock != null ? helpTextBlock.hashCode() : 0);
        result = 31 * result + (possibleValues != null ? possibleValues.hashCode() : 0);
        result = 31 * result + (sortPossibleValues != null ? sortPossibleValues.hashCode() : 0);
        result = 31 * result + (textSelectValue != null ? textSelectValue.hashCode() : 0);
        result = 31 * result + (int) isMandatory;
        result = 31 * result + (int) fieldOrder;
        result = 31 * result + (int) sortValues;
        result = 31 * result + (int) isActive;
        result = 31 * result + (int) showInSignup;
        result = 31 * result + (int) adminUseOnly;
        result = 31 * result + (int) isEncrypted;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        return result;
    }
}
