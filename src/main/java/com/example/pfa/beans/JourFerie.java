package com.example.pfa.beans;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class JourFerie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;
    public JourFerie(int id,LocalDate dateDebut, LocalDate dateFin, String description) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.description = description;
    }


    public JourFerie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
