package arrayLists.ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Non-Primitive
        String name;
        Student ab;

        ArrayList<String> namess = new ArrayList<String>();

        ArrayList<String> names = new ArrayList<String>();
        names.add("Melanie");
        names.add("John");
        names.add("Jane");

        // Update Values
        System.out.println(names.get(0));
        names.set(0, "Richard");
        System.out.println(names.get(0));

        // Delete Values
        names.remove(0);
        System.out.println(names.get(0));

        // Read Values
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // ArrayList

        names.remove(1);
        System.out.println(names.size());

        // ArrayList ints = new ArrayList<Integer>();

        int x = names.size();
        // Student ab = new Student ~~~~~~~~~~~~~~~~
        // Instantiating Student object to represent student

        // Iterating ArrayList ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // or you can also use for-each Loop

        for (String s : names) {
            System.out.println(s);
        }

        ArrayList<Student> students =3 new ArrayList<Student>();
        students.add(new Student("Melanie", "BSIT"));

        // Update Values
        students.set(0, new Student("Richard", "BSCS"));
        // You can also instantiate students
        /*
         * students s = new Student("Melanie", "BSIT");
         * students.add(s);
         * 
         */

        // Delete Values
        // students.remove(0);
        // students.get(1).introduce();

        // For Each Loop
        for (Student s : students) {
            s.introduce();
        }
    }

}
