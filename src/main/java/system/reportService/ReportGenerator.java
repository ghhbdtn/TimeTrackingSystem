package system.reportService;

import java.util.Date;
import java.util.Map;

public abstract class ReportGenerator {
    public abstract Report createReport(Map.Entry<Date, Date> reportPeriod, int userId);
}