package system.reportService;

import entities.Employee;
import system.Request;
import system.SystemController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesReportFactory extends ReportGenerator {
    @Override
    public Report createReport(Map.Entry<Date, Date> reportPeriod, int userId) {
        List<String> columns = getDays(reportPeriod);
        List<String> rows = ((List<Employee>) SystemController.getInstance().processRequest(
                new Request(Request.RequestType.GET, Employee.class, new ArrayList<Employee>())
        )).stream()
                .map(Employee::getFullName)
                .collect(Collectors.toList());

        return new EmployeesReport(rows, columns);
    }

    private List<String> getDays(Map.Entry<Date, Date> reportPeriod) {
        return new ArrayList<>();
    }
}
