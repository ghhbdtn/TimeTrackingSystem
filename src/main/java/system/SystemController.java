package system;

import entities.Admin;
import entities.Employee;
import system.reportService.*;
import system.reportService.adapter.CsvReportAdapter;
import system.reportService.adapter.JsonReportAdapter;
import system.reportService.adapter.ReportAdapter;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class SystemController {

    private static SystemController instance;

    private DataService dataService;

    private List<Employee> employees;

    private List<Admin> admins;

    private ReportGenerator reportGenerator;

    private ActivityDiagramCreator activityDiagramCreator;

    private SystemController() {
        dataService = new DataService();
    }

    public static SystemController getInstance() {
        if (instance == null) {
            instance = new SystemController();
        }
        return instance;
    }

    public Object processRequest(Request request) {
       return new Object();
    }
    
    public String getFormattedReport(ReportType reportType, Map.Entry<Date, Date> period, int userId, ReportFormat format) {
        switch (reportType) {
            case EMPLOYEE:
                reportGenerator = new EmployeeReportFactory();
            case SUBORDINATES:
                reportGenerator = new EmployeesReportFactory();
            case EMPLOYEES_STATUSES:
                reportGenerator = new EmployeesStatusReportFactory();
        }
        
        Report report = reportGenerator.createReport(period, userId);
        ReportAdapter adapter;

        switch (format) {
            case CSV:
                adapter = new CsvReportAdapter(report);
            case JSON:
                adapter = new JsonReportAdapter(report);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + format);
        }
        
        return adapter.getFormattedReport();
    }
}
