package com.dj.school.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Standard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    //    1 standard -> many Division
    @OneToMany(mappedBy = "standard",cascade = CascadeType.ALL)
    private List<Division> division;

    @OneToOne(mappedBy = "standard")
    private Student student;

    @ManyToMany
    private List<Subject> subjects;

    @OneToMany(mappedBy = "standard")
    private List<Mark> mark;

    public Standard() {
    }

    public Standard(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public List<Division> getDivision() {
        return division;
    }

    public void setDivision(List<Division> division) {
        this.division = division;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Mark> getMark() {
        return mark;
    }

    public void setMark(List<Mark> mark) {
        this.mark = mark;
    }
}
