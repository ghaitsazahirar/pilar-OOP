public abstract class Absence {
    public abstract void checkIn();
}

public class EmployeeAbsence extends Absence {
    @Override
    public void checkIn() {
        System.out.println("Employee checked in using mobile app.");
    }
}
