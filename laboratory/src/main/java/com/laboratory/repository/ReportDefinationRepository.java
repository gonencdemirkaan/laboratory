package com.laboratory.repository;

import com.laboratory.model.ReportDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportDefinationRepository extends JpaRepository<ReportDefinition, Long> {

    List<ReportDefinition> findByOrderByReportDate();

    List<ReportDefinition> findAllByNameContainingIgnoreCaseOrSurnameContainingIgnoreCaseOrIdentityContainingIgnoreCaseOrLaborant_NameContainingIgnoreCaseOrLaborant_SurnameOrderByReportDateDesc(String name, String surname, String identity, String laborantName, String laborantSurname);


}
