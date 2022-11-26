package com.laboratory.repository;

import com.laboratory.model.Laborant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LaborantRepository extends JpaRepository<Laborant, Long> {

    List<Laborant> findAllByNameContainingIgnoreCaseOrSurname(String name, String surname);
}
