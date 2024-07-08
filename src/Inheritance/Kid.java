package Inheritance;
//Can Inherit the Inherit class of the Toddle

//Nested Inheritance 

public class Kid extends Toddler {

    // New variable
    int gradeLevel;

    // Constructor inherited in Toddler
    Kid(String name, String sex, int age, String favoriteGame, int gradeLevel) {
        super(name, sex, age, favoriteGame);
        this.gradeLevel = gradeLevel; // New Attribute in this class "TOddler"
    }

    void sayGradeLevel() {
        System.err.println("I am Grade" + gradeLevel);
    }
}
