package entities;

public class WorkTime {
    private int startTime;
    private int endTime;
    private int startBreakTime;
    private int endBreakTime;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getStartBreakTime() {
        return startBreakTime;
    }

    public void setStartBreakTime(int startBreakTime) {
        this.startBreakTime = startBreakTime;
    }

    public int getEndBreakTime() {
        return endBreakTime;
    }

    public void setEndBreakTime(int endBreakTime) {
        this.endBreakTime = endBreakTime;
    }
}
