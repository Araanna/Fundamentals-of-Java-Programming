package Enum;

public class Main {

    public static void main(String[] args) {

        AILevel level = AILevel.EASY;

        if (level == AILevel.EASY) {
            System.out.println("For Babies");
        } else if (level == AILevel.MEDIUM) {
            System.out.println("For Kids");
        } else if (level == AILevel.HARD) {
            System.out.println("For Men");
        }

        System.out.println();

        // You can also write your own else statements in one Line without curly braces
        if (level == AILevel.EASY)
            System.out.println("For Babies");
        else if (level == AILevel.MEDIUM)
            System.out.println("For Kids");
        else if (level == AILevel.HARD)
            System.out.println("For Men");

        System.out.println();

        // Switch Statements of Enumerations
        AILevel level1 = AILevel.HARD;

        switch (level1) {
            case EASY:
                System.out.println("For Babies");
                break;
            case MEDIUM:
                System.out.println("For Kids");
                break;
            case HARD:
                System.out.println("For Men");
                break;

        }
        System.out.println(level);
    }

}
