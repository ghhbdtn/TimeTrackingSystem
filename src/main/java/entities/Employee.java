package entities;

public class Employee {
    private int id;
    private String fullName;
    private String position;
    private String hiringDate;
    private Department department;
    private TimeSettings timeSettings;
    private Session session;
    private boolean supervisor;

    public Employee() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public TimeSettings getTimeSettings() {
        return timeSettings;
    }

    public void setTimeSettings(TimeSettings timeSettings) {
        this.timeSettings = timeSettings;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public boolean isSupervisor() {
        return supervisor;
    }

    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }

    public void startWork(int time) {
        this.session = new Session();
        session.start(time);
    }

    public void startBreak(int time) {
        session.startBreak(time);
    }

    public void endBreak(int time) {
        session.endBreak(time);
    }

    public void stopWork(int time) {
        session.stop(time);
        this.session = null;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", hiringDate='" + hiringDate + '\'' +
                ", department='" + department + '\'' +
                ", workTime='" + timeSettings + '\'' +
                ", sessions='" + session + '\'' +
                '}';
    }
}

