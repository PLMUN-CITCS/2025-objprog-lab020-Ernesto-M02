import java.util.Scanner;

public class MenuDrivenProgram {

    //... (method to displayMenu)...
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    //... (method of handleMenuChoice)...
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser ();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0); 
                break;
            default:
                System.out.println("Error: Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    //...  (method of greetUser)...
    public static void greetUser () {
        System.out.println("Hello! Welcome!");
    }

    //... (method of checkEvenorOdd)...
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); 
        }
    }

    //... (main method)...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu(); 
            System.out.print("Enter your choice (1-3): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                handleMenuChoice(choice); 
            } else {
                System.out.println("Error: Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); 
            }
        }
    }
}