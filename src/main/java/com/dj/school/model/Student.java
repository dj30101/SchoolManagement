package com.dj.school.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private String gender;

    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "standard_id")
//    private Standard standard;

//    @OneToMany
//    private List<Standard> standard;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "division_id")
    private Division division;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "standard_id")
    private Standard standard;

    @OneToMany(mappedBy = "student")
    private List<Mark> mark;

    public Student() {
    }

    public Student(Long id, String name, LocalDate dateOfBirth, String gender, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public List<Mark> getMark() {
        return mark;
    }

    public void setMark(List<Mark> mark) {
        this.mark = mark;
    }
}
