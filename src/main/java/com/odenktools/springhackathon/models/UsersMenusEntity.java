package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users_menus", schema = "tingtong", catalog = "")
public class UsersMenusEntity {
    private int idMenu;
    private int parentMenu;
    private String menuTitle;
    private String menuName;
    private String backendRoute;
    private String image;
    private byte isActive;
    private byte menuOrder;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id_menu", nullable = false)
    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    @Basic
    @Column(name = "parent_menu", nullable = false)
    public int getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(int parentMenu) {
        this.parentMenu = parentMenu;
    }

    @Basic
    @Column(name = "menu_title", nullable = true, length = 50)
    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    @Basic
    @Column(name = "menu_name", nullable = true, length = 50)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "backend_route", nullable = true, length = 128)
    public String getBackendRoute() {
        return backendRoute;
    }

    public void setBackendRoute(String backendRoute) {
        this.backendRoute = backendRoute;
    }

    @Basic
    @Column(name = "image", nullable = true, length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
    @Column(name = "menu_order", nullable = false)
    public byte getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(byte menuOrder) {
        this.menuOrder = menuOrder;
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

        UsersMenusEntity that = (UsersMenusEntity) o;

        if (idMenu != that.idMenu) return false;
        if (parentMenu != that.parentMenu) return false;
        if (isActive != that.isActive) return false;
        if (menuOrder != that.menuOrder) return false;
        if (menuTitle != null ? !menuTitle.equals(that.menuTitle) : that.menuTitle != null) return false;
        if (menuName != null ? !menuName.equals(that.menuName) : that.menuName != null) return false;
        if (backendRoute != null ? !backendRoute.equals(that.backendRoute) : that.backendRoute != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMenu;
        result = 31 * result + parentMenu;
        result = 31 * result + (menuTitle != null ? menuTitle.hashCode() : 0);
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (backendRoute != null ? backendRoute.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (int) isActive;
        result = 31 * result + (int) menuOrder;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        return result;
    }
}
