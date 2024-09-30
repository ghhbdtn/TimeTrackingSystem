package system.reportService;

import javax.swing.table.TableModel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public abstract class Report {
    public LocalDate reportDate;
    public List<String> columns;
    public List<String> rows;

    Report( List<String> rows, List<String> columns){
        this.reportDate = LocalDateTime.now().toLocalDate();
        this.rows = rows;
        this.columns = columns;
    }

    public abstract TableModel getTable();
}
