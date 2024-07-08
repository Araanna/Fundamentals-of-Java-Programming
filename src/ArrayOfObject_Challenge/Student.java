package ArrayOfObject_Challenge;

public class Student {

    // Fields
    private String fName, Lname;
    private String course;
    private int year;
    private char section;

    // Constructor
    Student(String fName,
            String Lname,
            String course,
            int year,
            char section)

    {
        this.fName = fName;
        this.Lname = Lname;
        this.course = course;
        this.year = year;
        this.section = section;
    }

    // Method

    void introduceSelf() {
        System.out.println("Full Name : " + fName + " " + Lname);
        System.out.println("C/Y/S ~ Course/Yr/ Sec. : " + course + " - " + year + section);
        System.out.println();
    }

}
