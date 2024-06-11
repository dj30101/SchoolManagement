package com.dj.school.model;

import jakarta.persistence.*;

@Entity
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "obtained_mark")
    private Double obtainedMark;

    @Column(name = "total_mark")
    private Double totalMark;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "standard_id")
    private Standard standard;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    public Mark() {
    }

    public Mark(Long id, Double obtainedMark, Double totalMark) {
        this.id = id;
        this.obtainedMark = obtainedMark;
        this.totalMark = totalMark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getObtainedMark() {
        return obtainedMark;
    }

    public void setObtainedMark(Double obtainedMark) {
        this.obtainedMark = obtainedMark;
    }

    public Double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(Double totalMark) {
        this.totalMark = totalMark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
