package edu.jcourse.lesson5.tostring;

public class PersonMain {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId("11");
        employee.setFirstName("John");
        employee.setLastName("Green");
        employee.setEmail("john.green@mail.com");
        employee.setDepartment("Application Development");

        Student student = new Student();
        student.setFirstName("Ivan");
        student.setLastName("Ivanov");
        student.setFaculty("Java Programming");
        student.setEmail("ivan.ivanov@mail.com");

        System.out.println(employee.getFirstName() + " ");

        System.out.println(employee);
        System.out.println(student.toString());
    }
}
