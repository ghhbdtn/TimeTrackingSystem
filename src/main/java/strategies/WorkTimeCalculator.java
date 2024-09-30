package strategies;

public interface WorkTimeCalculator {
    int calculateNormTime(int workedTime, int normWorkTime, int normBreakTime);
    int calculateOverTime(int workedTime, int normWorkTime, int normBreakTime);
}
