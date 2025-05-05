import java.util.Scanner;

public class gradeaveraging {

    public static void main(String[] args) {

        // ask the end user to input their numerical grade
        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        // our while loop will count how many times we are asking the end user to input a grade

        while(counter <= 5 ) {
            System.out.println("Please enter your " +counter+ " numerical grade");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        } // close while loop

        String message;
        char letterGrade;

        counter -= 1;

        average = total / counter;

        System.out.println("You have earned an average grade of " +average+ " after proding us with " +counter+ " grades");

        if (average >= 90 && average <= 100) {
            letterGrade = 'A';
            message = "excellent work";

        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = "solid work";

        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "more studying necessary";

        } else if (average >= 65 && average < 70) {
            letterGrade = 'D';
            message = "kind of getting by";

        } else {
            letterGrade = 'F';
            message = "you did not pass";

        }

            System.out.println("you have earned the following letter grade of " +letterGrade+ ", and here is the message: " +message);


    }
}
