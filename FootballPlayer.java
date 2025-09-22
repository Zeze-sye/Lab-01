import javax.swing.*;
import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {

        // Task1 ->Declaring and using variables

        String name;
        int age;
        double height;
        double weight;
        int jerseyNum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PLAYER INFORMATION DETAILS");

        System.out.print("Hey there! What is your name: ");
        name = scanner.nextLine();

        System.out.print("How old are you? ");
        age = scanner.nextInt();

        System.out.print("Enter your height in meters: ");
        height = scanner.nextDouble();

        System.out.print("Enter your weight: ");
        weight = scanner.nextDouble();

        System.out.print("Enter your jersey number: ");
        jerseyNum = scanner.nextInt();

        // Task 2 -> Constant, Data Types and Type Casting

         double pound = 0.45359237;
         int meter = 100;

         double  newWeight = weight * pound;
         double newHeight = height * meter;
         int newWeightInt = (int) (weight * pound);
         int newHeightInt = (int) (height * meter);

        System.out.printf("Player - %s",name);
        System.out.printf("\nAge - %d",age);
        System.out.printf("\nHeight in centimeters - %.2fcm",newHeight);
        System.out.printf("\nWeight in Kilograms - %.2fkg",newWeight);
        System.out.printf("\nJersey Number - %d",jerseyNum);


        // Task3 -> Increment and Decrement Operators
        System.out.println(age);
        System.out.println(++age);
        int newJerseyNum = --jerseyNum;
        System.out.println(newJerseyNum);


        //Task4 -> Boolean Expressions and Logical Operators
        if(age >= 18 && age <=30){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }

        if(age < 18 || weight >= 90){
            System.out.println("Player has a problem(either too young or too heavy)");
        }

        if (!(age >= 18 && age <= 30)){
            System.out.println("Not Eligible");
        }

        // Task 5 -> Selection Statements
        if( age < 20){
            System.out.println("Rising Star");
        }
        else if (age >=20 && age <30) {
            System.out.println("Prime Player");
        }
        else{
            System.out.println("Veteran");
        }

        //Task6 -> Switch Cases
        System.out.print("Enter jersey number: ");
        int jerseyNumber = scanner.nextInt();

        switch (jerseyNumber) {
            case 1: System.out.println("Goalkeeper");break;
            case 2: System.out.println("Defender");break;
            case 5: System.out.println("Defender");break;
            case 6: System.out.println("Midfielder");break;
            case 7: System.out.println("Winger");break;
            case 8: System.out.println("Midfielder");break;
            case 9: System.out.println("Striker");break;
            case 10:System.out.println("Playmaker");break;
            case 11:System.out.println("Winger");break;
            default: System.out.println("Player position not Known");
        }

        // Task7 -> Switch Cases
        //A- Unwanted Fall-Through (classic switch, no arrow syntax)
        System.out.print("Enter jersey number: ");
        int jerseyNumber2 = scanner.nextInt();

        switch (jerseyNumber2) {
            case 1: System.out.println("Goalkeeper");break;
            case 2: System.out.println("Defender");   // no break -> will fall through
            case 5: System.out.println("Defender");break;
            case 6: System.out.println("Midfielder"); // no break -> will fall through
            case 7: System.out.println("Winger");     // no break -> will fall through
            case 8: System.out.println("Midfielder");break;
            case 9: System.out.println("Striker");break;
            case 10: System.out.println("Playmaker");break;
            case 11: System.out.println("Winger");break;
            default:System.out.println("Player position not Known");
        }
        //B
        switch (jerseyNumber) {
            case 2,5 : System.out.println("Defender");break;
            case 6,8: System.out.println("Midfielder");break;
            case 7, 11: System.out.println("Winger");break;
            case 1: System.out.println("Goalkeeper");break;
            case 9: System.out.println("Striker");break;
            case 10: System.out.println("Playmaker");break;
            default: System.out.println("Player position not Known");
        }

        //Task8 -> Nested Ifs
        if (age >=20 && age <30){
            if(newWeightInt < 80){
                System.out.println("Starting lineup");
            }
            else{
                System.out.println("Bench");
            }
        }
        else{
            System.out.println("Not a prime player");
        }


        //Task9 -> Conditional Expression
        String decision = (age >= 18 && age <=30)? "" : "Not Eligible ";
        System.out.println(decision);









        scanner.close();


    }
}
