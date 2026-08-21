class EmployeeRecord {
    private final int employeeId;

    EmployeeRecord(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

public class ReadOnlyExample {
    public static void main(String[] args) {
        EmployeeRecord employee = new EmployeeRecord(101);
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}