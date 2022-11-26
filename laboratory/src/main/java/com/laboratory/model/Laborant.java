package com.laboratory.model;

import javax.persistence.*;

import java.util.List;

@Entity(name = "laborant")
public class Laborant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String surname;

    private String hospitalId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "laborant_reports", joinColumns = @JoinColumn(name = "laborant_id"), inverseJoinColumns = @JoinColumn(name = "report_definations_id"))
    private List<ReportDefinition> reports;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<ReportDefinition> getReports() {
        return reports;
    }

    public void setReports(List<ReportDefinition> reports) {
        this.reports = reports;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }
}
