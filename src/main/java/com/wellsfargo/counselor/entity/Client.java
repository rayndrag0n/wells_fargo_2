package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientid;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisorid;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String addressName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private long phone;

    protected Client() {}

    public Client(String firstName, String lastName, String addressName, String email, long phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressName = addressName;
        this.email = email;
        this.phone = phone;
    }

    public Long getClientid() {
        return clientid;
    }

    public Advisor getAdvisorid() {
        return advisorid;
    }

    public void setAdvisorid(Advisor advisorid) {
        this.advisorid = advisorid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
