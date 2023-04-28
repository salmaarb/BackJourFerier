package com.example.pfa.repository;

import com.example.pfa.beans.JourFerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface JourFerieRepo extends JpaRepository<JourFerie, Integer>{
    @Query("SELECT dateDebut  FROM JourFerie ")
    public List<LocalDate> getDateDebut();
}
