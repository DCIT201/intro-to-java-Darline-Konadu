import java.util.Scanner;
public class Main{public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    // Scanner class to take the user's input
    // This allows the user to input his or her choice
    System.out.println("1.Convert Celsius to Fahrenheit");
    System.out.println("2.Convert Fahrenheit to Celsius");
    double choice = scanner.nextDouble();

    // Makes the user's choice known and converts the choice into the required degree Celsius or fa
    // Fahrenheit
    if (choice ==1) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Celsius to Fahrenheit: " + fahrenheit);
    }
    else if (choice == 2){
            System.out.print("Enter temperature in Fahrenheit: ");
             double fahrenheit = scanner.nextDouble();
             double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Fahrenheit to Celsius: " + celsius);

        }


}


    }









