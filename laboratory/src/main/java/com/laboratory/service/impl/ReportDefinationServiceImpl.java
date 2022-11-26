package com.laboratory.service.impl;

import com.laboratory.model.ReportDefinition;
import com.laboratory.repository.LaborantRepository;
import com.laboratory.repository.ReportDefinationRepository;
import com.laboratory.service.ReportDefinationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportDefinationServiceImpl implements ReportDefinationService {

    private final ReportDefinationRepository reportDefinationRepository;

    public ReportDefinationServiceImpl(ReportDefinationRepository reportDefinationRepository) {
        this.reportDefinationRepository = reportDefinationRepository;
    }


    @Override
    public ReportDefinition createReport(ReportDefinition report) {
        return reportDefinationRepository.save(report);
    }

    @Override
    public ReportDefinition updateReport(ReportDefinition report) {
        ReportDefinition reportDefinition = reportDefinationRepository.findById(report.getId()).get();

        reportDefinition.setReportDate(report.getReportDate());
        reportDefinition.setDiagnosisDescription(report.getDiagnosisDescription());
        reportDefinition.setDiagnosisTitle(report.getDiagnosisTitle());
        reportDefinition.setIdentity(report.getIdentity());
        reportDefinition.setImage(report.getImage());
        reportDefinition.setName(report.getName());
        reportDefinition.setSurname(report.getSurname());

        return reportDefinationRepository.save(reportDefinition);
    }

    @Override
    public void deleteReport(ReportDefinition report) {
        reportDefinationRepository.delete(report);
    }

    @Override
    public List<ReportDefinition> getAllReports() {
        return reportDefinationRepository.findAll();
    }

    @Override
    public List<ReportDefinition> getAllReportsByReportTimeAsc() {
        return reportDefinationRepository.findByOrderByReportDate();
    }

    @Override
    public ReportDefinition getReportById(Long id) {
        return reportDefinationRepository.findById(id).get();
    }

    @Override
    public List<ReportDefinition> search(String query) {
        return reportDefinationRepository.findAllByNameContainingIgnoreCaseOrSurnameContainingIgnoreCaseOrIdentityContainingIgnoreCaseOrLaborant_NameContainingIgnoreCaseOrLaborant_SurnameOrderByReportDateDesc(query, query, query, query, query);
    }
}
