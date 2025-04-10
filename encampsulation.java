//ENCAPSULATION example

public class Attendance {
    private int employeeId;
    private String date;
    private boolean isLate;

    public Attendance(int employeeId, String date, boolean isLate) {
        this.employeeId = employeeId;
        this.date = date;
        this.isLate = isLate;
    }

    public boolean getIsLate() {
        return isLate;
    }

    public String getDate() {
        return date;
    }
}
