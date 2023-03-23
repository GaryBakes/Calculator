import java.util.Scanner; // Import Scanner class for user input

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object for user input

        System.out.println("Welcome to Calculator");

        while (true) { // Loop to keep the calculator running until the user chooses to exit
            System.out.println("Please select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");

            int choice = scanner.nextInt(); // Read the user's choice of operation

            if (choice == 8) { // If the user chooses to exit, break out of the loop
                System.out.println("Thank you for using Calculator");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble(); // Read the first number from the user

            if (choice != 7) { // If the operation does not require a second number, skip this step
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble(); // Read the second number from the user

                // Perform the selected operation based on the user's choice
                switch (choice) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        break;
                    case 5:
                        System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
                        break;
                    case 6:
                        System.out.println("log_" + num1 + " " + num2 + " = " + Math.log(num2) / Math.log(num1));
                        break;
                }
            } else { // If the operation is square root, perform the operation on the first number only
                System.out.println("sqrt(" + num1 + ") = " + Math.sqrt(num1));
            }
        }
        scanner.close(); // Close the Scanner object to prevent resource leak
    }
}
