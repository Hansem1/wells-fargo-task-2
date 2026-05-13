package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisor;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 255)
    private String email;

    @Column(nullable = false, length = 30)
    private String phoneNumber;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(nullable = false)
    private LocalDate dateOnboarded;

    protected Client() {
    }

    public Client(Advisor advisor, String firstName, String lastName, String email,
                  String phoneNumber, String status, LocalDate dateOnboarded) {
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.dateOnboarded = dateOnboarded;
    }

    public Long getClientId() {
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDateOnboarded() {
        return dateOnboarded;
    }

    public void setDateOnboarded(LocalDate dateOnboarded) {
        this.dateOnboarded = dateOnboarded;
    }
}
