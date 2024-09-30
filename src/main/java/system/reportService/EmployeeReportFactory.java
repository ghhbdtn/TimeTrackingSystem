package system.reportService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class EmployeeReportFactory extends ReportGenerator {
    @Override
    public Report createReport(Map.Entry<Date, Date> reportPeriod, int userId) {
        List<String> columns = getDays(reportPeriod);
        List<String> rows = List.of("Нормативное время, ч.", "Сверхурочное время, ч.", "Перерыв, ч.");

        return new EmployeeReport(rows, columns);
    }

    private List<String> getDays(Map.Entry<Date, Date> reportPeriod) {
        return new ArrayList<>();
    }
}
