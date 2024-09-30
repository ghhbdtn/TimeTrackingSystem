package entities;

import strategies.FixedWorkTimeCalculator;
import strategies.FlexibleWorkTimeCalculator;
import strategies.WorkTimeCalculator;

public class TimeSettings {


    private int normWorkTime;

    private int normBreakTime;

    private WorkMode workMode;

    private WorkTimeCalculator calculator;

    public TimeSettings(int normWorkTime, int normBreakTimeTime, WorkMode workMode) {
        this.normWorkTime = normWorkTime;
        this.normBreakTime = normBreakTimeTime;
        this.workMode = workMode;
        setCalculator();
    }

    private void setCalculator() {
        if (workMode == WorkMode.FIXED) {
            calculator = new FixedWorkTimeCalculator();
        } else {
            calculator = new FlexibleWorkTimeCalculator();
        }
    }

    public int calculateNormTime(int workedTime) {
        return calculator.calculateNormTime(workedTime, normWorkTime, normBreakTime);
    }

    public int calculateOverTime(int workedTime) {
        return calculator.calculateOverTime(workedTime, normWorkTime, normBreakTime);
    }

    public int getNormWorkTime() {
        return normWorkTime;
    }

    public void setNormWorkTime(int normWorkTime) {
        this.normWorkTime = normWorkTime;
    }

    public int getNormBreakTime() {
        return normBreakTime;
    }

    public void setNormBreakTime(int normBreakTime) {
        this.normBreakTime = normBreakTime;
    }

    public WorkMode getWorkMode() {
        return workMode;
    }

    public void setWorkMode(WorkMode workMode) {
        this.workMode = workMode;
        setCalculator();
    }

    private enum WorkMode {
        FIXED, FLEXIBLE
    }
}
