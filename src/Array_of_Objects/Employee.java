package Array_of_Objects;

public class Employee {

    // Fields
    String firstName, lastName;
    String jobTitle;

    // Constructor
    Employee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    // Method
    void introduceSelf() {
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Job Title: " + jobTitle);
    }
}
