package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false, length = 150)
    private String portfolioName;

    @Column(nullable = false)
    private LocalDate createdDate;

    @Column(nullable = false)
    private LocalDateTime lastUpdated;

    @Column(nullable = false)
    private double totalValue;

    protected Portfolio() {
    }

    public Portfolio(Client client, String portfolioName, LocalDate createdDate,
                     LocalDateTime lastUpdated, double totalValue) {
        this.client = client;
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
        this.totalValue = totalValue;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
