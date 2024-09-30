package system.reportService.adapter;

import system.reportService.Report;

import javax.swing.table.TableModel;

public class JsonReportAdapter implements ReportAdapter {
    private  final Report report;

    public JsonReportAdapter(Report report) {
        this.report = report;
    }

    @Override
    public String getFormattedReport() {
        StringBuilder jsonOutput = new StringBuilder();
        TableModel table = report.getTable();

        jsonOutput.append("{\n");
        jsonOutput.append("\"reportDate\": \"").append(report.reportDate).append("\",\n");
        jsonOutput.append("\"data\": [\n");

        for (int i = 0; i < table.getRowCount(); i++) {
            jsonOutput.append("{\n");
            for (int j = 0; j < table.getColumnCount(); j++) {
                jsonOutput.append("\"").append(table.getColumnName(j)).append("\": \"")
                        .append(table.getValueAt(i, j)).append("\"");
                if (j < table.getColumnCount() - 1) {
                    jsonOutput.append(",\n");
                }
            }
            jsonOutput.append("\n}");
            if (i < table.getRowCount() - 1) {
                jsonOutput.append(",\n");
            }
        }
        jsonOutput.append("\n]\n}");
        return jsonOutput.toString();
    }
}
