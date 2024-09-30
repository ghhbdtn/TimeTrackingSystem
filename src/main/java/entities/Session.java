package entities;

public class Session {
    private int sessionId;
    private WorkTime workTime;
    private SessionStatus status;

    public Session() {

    }

    // Getters and setters
    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public WorkTime getWorkTime() {
        return workTime;
    }

    public void setWorkTime(WorkTime workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Session{" +
                "sessionId=" + sessionId +
                ", workTime='" + workTime + '\'' +
                '}';
    }

    public SessionStatus getStatus() {
        return status;
    }

    public void setStatus(SessionStatus status) {
        this.status = status;
    }

    public void startBreak(int time) {
        setStatus(SessionStatus.PAUSED);
        workTime.setStartBreakTime(time);
    }

    public void start(int time) {
        setStatus(SessionStatus.ACTIVE);
        workTime.setStartTime(time);
    }

    public void endBreak(int time) {
        setStatus(SessionStatus.ACTIVE);
        workTime.setEndBreakTime(time);
    }

    public void stop(int time) {
    }

    public enum SessionStatus {
        ACTIVE, PAUSED, ENDED;
    }
}

