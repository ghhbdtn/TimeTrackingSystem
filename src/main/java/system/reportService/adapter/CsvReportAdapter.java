package system.reportService.adapter;

import system.reportService.Report;

import javax.swing.table.TableModel;

public class CsvReportAdapter implements ReportAdapter {
    private final Report report;

    public CsvReportAdapter(Report report) {
        this.report = report;
    }

    @Override
    public String getFormattedReport() {
        StringBuilder csvOutput = new StringBuilder();
        TableModel table = report.getTable();

        // Добавляем заголовки
        for (int i = 0; i < table.getColumnCount(); i++) {
            csvOutput.append(table.getColumnName(i));
            if (i < table.getColumnCount() - 1) {
                csvOutput.append(",");
            }
        }
        csvOutput.append("\n");

        // Добавляем строки
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                csvOutput.append(table.getValueAt(i, j));
                if (j < table.getColumnCount() - 1) {
                    csvOutput.append(",");
                }
            }
            csvOutput.append("\n");
        }
        return csvOutput.toString();
    }
}
