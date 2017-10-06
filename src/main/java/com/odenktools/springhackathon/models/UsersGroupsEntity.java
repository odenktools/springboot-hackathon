package com.odenktools.springhackathon.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "users_groups", schema = "tingtong", catalog = "")
public class UsersGroupsEntity {
    private int id;
    private String named;
    private String coded;
    private String namedDescription;
    private byte isActive;
    private byte isPurchaseable;
    private BigDecimal price;
    private int timeLeft;
    private int quantity;
    private int period;
    private byte isBuiltin;
    private String backcolor;
    private String forecolor;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "named", nullable = false, length = 50)
    public String getNamed() {
        return named;
    }

    public void setNamed(String named) {
        this.named = named;
    }

    @Basic
    @Column(name = "coded", nullable = false, length = 50)
    public String getCoded() {
        return coded;
    }

    public void setCoded(String coded) {
        this.coded = coded;
    }

    @Basic
    @Column(name = "named_description", nullable = true, length = -1)
    public String getNamedDescription() {
        return namedDescription;
    }

    public void setNamedDescription(String namedDescription) {
        this.namedDescription = namedDescription;
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
    @Column(name = "is_purchaseable", nullable = false)
    public byte getIsPurchaseable() {
        return isPurchaseable;
    }

    public void setIsPurchaseable(byte isPurchaseable) {
        this.isPurchaseable = isPurchaseable;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "time_left", nullable = false)
    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "period", nullable = false)
    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
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
    @Column(name = "backcolor", nullable = false, length = 24)
    public String getBackcolor() {
        return backcolor;
    }

    public void setBackcolor(String backcolor) {
        this.backcolor = backcolor;
    }

    @Basic
    @Column(name = "forecolor", nullable = false, length = 24)
    public String getForecolor() {
        return forecolor;
    }

    public void setForecolor(String forecolor) {
        this.forecolor = forecolor;
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

        UsersGroupsEntity that = (UsersGroupsEntity) o;

        if (id != that.id) return false;
        if (isActive != that.isActive) return false;
        if (isPurchaseable != that.isPurchaseable) return false;
        if (timeLeft != that.timeLeft) return false;
        if (quantity != that.quantity) return false;
        if (period != that.period) return false;
        if (isBuiltin != that.isBuiltin) return false;
        if (named != null ? !named.equals(that.named) : that.named != null) return false;
        if (coded != null ? !coded.equals(that.coded) : that.coded != null) return false;
        if (namedDescription != null ? !namedDescription.equals(that.namedDescription) : that.namedDescription != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (backcolor != null ? !backcolor.equals(that.backcolor) : that.backcolor != null) return false;
        if (forecolor != null ? !forecolor.equals(that.forecolor) : that.forecolor != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (named != null ? named.hashCode() : 0);
        result = 31 * result + (coded != null ? coded.hashCode() : 0);
        result = 31 * result + (namedDescription != null ? namedDescription.hashCode() : 0);
        result = 31 * result + (int) isActive;
        result = 31 * result + (int) isPurchaseable;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + timeLeft;
        result = 31 * result + quantity;
        result = 31 * result + period;
        result = 31 * result + (int) isBuiltin;
        result = 31 * result + (backcolor != null ? backcolor.hashCode() : 0);
        result = 31 * result + (forecolor != null ? forecolor.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        return result;
    }
}
