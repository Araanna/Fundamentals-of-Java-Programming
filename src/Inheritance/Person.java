package Inheritance;

public class Person {

    String name, sex;
    int age;

    // OVerload COnstructors
    /* Expicit Constructor */
    Person() {

    }// to unnecessarily create a Constructor in the Children class

    /* Implicit Constructor - because the parameter have arguments */
    Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void checkStatus() {
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
    }
}
