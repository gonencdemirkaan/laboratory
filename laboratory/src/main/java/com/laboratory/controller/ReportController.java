package com.laboratory.controller;

import com.laboratory.model.ReportDefinition;
import com.laboratory.request.SearchRequest;
import com.laboratory.service.LaborantService;
import com.laboratory.service.ReportDefinationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReportController {

    private final ReportDefinationService reportDefinationService;
    private final LaborantService laborantService;

    public ReportController(ReportDefinationService reportDefinationService, LaborantService laborantService) {
        this.reportDefinationService = reportDefinationService;
        this.laborantService = laborantService;
    }


    @GetMapping("/")//anasayfa
    public String homepage(Model model) {
        model.addAttribute("reports", reportDefinationService.getAllReports());
        model.addAttribute("search", new SearchRequest());
        return "report-list";
    }

    @GetMapping("/reports/create")
    public String createReportForm(Model model) {
        model.addAttribute("report", new ReportDefinition());
        model.addAttribute("laborants", laborantService.getAllLaborants());
        return "create-report";
    }

    @PostMapping("/reports/create")
    public String saveReport(Model model, ReportDefinition report) {
        model.addAttribute("report", reportDefinationService.createReport(report));
        return "redirect:/";
    }


    @GetMapping("/reports/{reportId}")
    public String updateReportForm(Model model, @PathVariable Long reportId) {
        ReportDefinition report = reportDefinationService.getReportById(reportId);
        model.addAttribute("report", report);
        model.addAttribute("laborants", laborantService.getAllLaborants());
        return "create-report";
    }


    @GetMapping("/reports/delete/{reportId}")
    public String deleteReport(@PathVariable Long reportId) {
        reportDefinationService.deleteReport(reportDefinationService.getReportById(reportId));
        return "redirect:/";
    }


    @PostMapping("/reports/search")
    public String searchReports(SearchRequest search, Model model) {
        model.addAttribute("reports", reportDefinationService.search(search.getQuery()));
        model.addAttribute("search", new SearchRequest());
        return "report-list";
    }


}
