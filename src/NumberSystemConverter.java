import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Choose what operation you want to perform:");
            System.out.println("A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println("W. Exit the program");

            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "A":
                    System.out.println("Performing conversion from any system to the decimal system...");
                    // Add your code for option A here
                    break;
                case "B":
                    System.out.println("Performing conversion from decimal system to another system...");
                    // Add your code for option B here
                    break;
                case "C":
                    System.out.println("Performing summing up numbers from different systems...");
                    // Add your code for option C here
                    break;
                case "D":
                    System.out.println("Performing subtracting numbers from different systems...");
                    // Add your code for option D here
                    break;
                case "E":
                    System.out.println("Performing multiplying numbers from different systems...");
                    // Add your code for option E here
                    break;
                case "F":
                    System.out.println("Performing dividing numbers from different systems...");
                    // Add your code for option F here
                    break;
                case "W":
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Adding a blank line for readability

        } while (!choice.equals("W"));

        scanner.close();
    }
}
