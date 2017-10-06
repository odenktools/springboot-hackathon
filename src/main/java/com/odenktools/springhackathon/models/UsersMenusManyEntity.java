package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_menus_many", schema = "tingtong", catalog = "")
public class UsersMenusManyEntity {
    private int idUserMenu;
    private int groupId;
    private int menuId;
    private String isCheck;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id_user_menu", nullable = false)
    public int getIdUserMenu() {
        return idUserMenu;
    }

    public void setIdUserMenu(int idUserMenu) {
        this.idUserMenu = idUserMenu;
    }

    @Basic
    @Column(name = "group_id", nullable = false)
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "menu_id", nullable = false)
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "is_check", nullable = true, length = 15)
    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
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

        UsersMenusManyEntity that = (UsersMenusManyEntity) o;

        if (idUserMenu != that.idUserMenu) return false;
        if (groupId != that.groupId) return false;
        if (menuId != that.menuId) return false;
        if (isCheck != null ? !isCheck.equals(that.isCheck) : that.isCheck != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUserMenu;
        result = 31 * result + groupId;
        result = 31 * result + menuId;
        result = 31 * result + (isCheck != null ? isCheck.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
