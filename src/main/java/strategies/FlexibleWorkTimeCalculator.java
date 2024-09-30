package strategies;

public class FlexibleWorkTimeCalculator implements WorkTimeCalculator {
    @Override
    public int calculateNormTime(int workedTime, int normWorkTime, int normBreakTime) {
        return workedTime - normBreakTime;
    }

    @Override
    public int calculateOverTime(int workedTime, int normWorkTime, int normBreakTime) {
        return Math.max(0, workedTime - normBreakTime - normWorkTime);
    }
}