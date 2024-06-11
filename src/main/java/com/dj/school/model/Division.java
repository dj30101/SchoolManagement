package com.dj.school.model;

import jakarta.persistence.*;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "standard_id")
    private Standard standard;

    @OneToOne(mappedBy = "division")
    private Student student;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "student_id")
//    private Student student;


    public Division() {
    }

    public Division(Long id, String name, Standard standard) {
        this.id = id;
        this.name = name;
        this.standard = standard;
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

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
