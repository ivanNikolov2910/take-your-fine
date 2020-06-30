package com.example.takeyourfine.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "fines")
public class Fine {
    private long id;
    private long number;
    private LocalDateTime dateOfIssue;
    private LocalDateTime dateOfPayment;
    private User user;
    private boolean isPaid;

    public Fine() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Column(name = "date_of_issue")
    public LocalDateTime getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDateTime dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Column(name = "date_of_payment")
    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    @ManyToOne
    @JoinColumn(name="owner_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "is_paid")
    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
