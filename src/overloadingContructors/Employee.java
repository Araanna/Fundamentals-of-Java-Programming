package overloadingContructors;

public class Employee {

    String firstName, lastName;
    String title, address, sex;

    int age;

    public Employee(String firstName,
            String lastName,
            String title,
            String address,
            String sex,
            int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    // overloadingCOntructOrs

    Employee(String firstName,
            String lastName,
            String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

}
