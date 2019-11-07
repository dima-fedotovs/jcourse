package edu.jcourse.lesson5.tostring;

public class Employee extends Person {
    private String department;
    private String employeeId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        String result = getEmployeeId() + ", " +
                getFirstName() + ", "
                + getLastName() + ", "
                + getEmail() + ", "
                + getDepartment();
        return result;
    }
}
