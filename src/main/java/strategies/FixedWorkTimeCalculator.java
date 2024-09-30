package strategies;

public class FixedWorkTimeCalculator implements WorkTimeCalculator {
    @Override
    public int calculateNormTime(int workedTime, int normWorkTime, int normBreakTime) {
        return Math.max(0, Math.min(workedTime - normBreakTime, normWorkTime));
    }

    @Override
    public int calculateOverTime(int workedTime, int normWorkTime, int normBreakTime) {
        return Math.max(0, workedTime - normBreakTime - normWorkTime);
    }
}