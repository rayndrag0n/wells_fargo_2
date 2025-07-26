package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityid;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolioid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    protected Security() {}

    public Security(Portfolio portfolioid, String name, String category, double purchasePrice, int quantity, LocalDate purchaseDate) {
        this.portfolioid = portfolioid;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }

    public Long getSecurityid() {
        return securityid;
    }

    public Portfolio getPortfolioid() {
        return portfolioid;
    }

    public void setPortfolioid(Portfolio portfolioid) {
        this.portfolioid = portfolioid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
