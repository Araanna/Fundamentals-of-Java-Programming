package Array_of_Objects;

public class Main {
    public static void main(String[] args) {

        // Employee e = new Employee("Melanie", "Abalde", "Software Engineer");

        Employee[] emp = new Employee[5];
         
        emp[0] = new Employee("Melanie", "Abalde", "Software Engineer");
        emp[1] = new Employee("Melanie", "Abalde", "Software Engineer");

        // loop for .introduceSelf twice
        for (int i = 0; i < emp.length; i++) {
            emp[i].introduceSelf();
        }

        // for-each loop works the same to for-loop
        /*
         * for(Employees e: emp)
         * {
         * e.introduceSelf();
         * }
         */

        System.out.println(emp[0].firstName);
        // Calling the Method
        emp[0].introduceSelf();
    }
}
