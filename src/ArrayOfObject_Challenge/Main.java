package ArrayOfObject_Challenge;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("How Many Students To Be Registered? ");

        int size = s.nextInt();
        s.nextLine();

        Student students[] = new Student[size];

        for (int i = 0; i < students.length; i++) {
            String fName, Lname, course;
            int year;
            char section;

            System.out.print("Student #" + (i + 1));

            System.out.println();

            System.out.print("First Name:  ");
            fName = s.nextLine();

            System.out.print("Last Name: ");
            Lname = s.nextLine();

            System.out.print("Course: ");
            course = s.nextLine();

            System.out.print("Year: ");
            year = s.nextInt();
            s.nextLine();

            System.out.print("Section: ");
            section = s.nextLine().charAt(0);

            System.out.println();
            System.out.println();

            students[i] = new Student(fName, Lname, course, year, section);

        }
        for (Student stud : students) {
            stud.introduceSelf();
        }
    }

}
