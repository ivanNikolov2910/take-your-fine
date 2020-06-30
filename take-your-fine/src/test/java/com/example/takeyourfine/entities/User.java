package com.example.takeyourfine.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "users")
public class User {
    private long id;
    private String fName;
    private String sName;
    private String lName;
    private String egn;
    private String email;
    private Set<Car> cars;
    private List<Fine> fines;

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Column(name = "surname", nullable = false)
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Column(name = "last_name", nullable = false)
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Column(name = "egn", nullable = false, unique = true, length = 10)
    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    @Column(name = "email", nullable = false, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToMany(targetEntity = Car.class, mappedBy = "owner", fetch = FetchType.EAGER)
    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    @OneToMany(targetEntity = Fine.class, mappedBy = "user", fetch = FetchType.EAGER)
    public List<Fine> getFines() {
        return fines;
    }

    public void setFines(List<Fine> fines) {
        this.fines = fines;
    }
}
