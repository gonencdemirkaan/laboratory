package com.laboratory.service;

import com.laboratory.model.ReportDefinition;

import java.util.List;

public interface ReportDefinationService {

    ReportDefinition createReport(ReportDefinition report);

    ReportDefinition updateReport(ReportDefinition report);

    void deleteReport(ReportDefinition report);

    List<ReportDefinition> getAllReports();

    List<ReportDefinition> getAllReportsByReportTimeAsc();

    ReportDefinition getReportById(Long id);

    List<ReportDefinition> search(String query);
}
