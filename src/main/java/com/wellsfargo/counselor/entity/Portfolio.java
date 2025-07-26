package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolio;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client clientId;

    @Column(nullable = false)
    private LocalDate creationDate;

    protected Portfolio() {}

    public Portfolio(Client clientId, LocalDate creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Long getPortfolio() {
        return portfolio;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
