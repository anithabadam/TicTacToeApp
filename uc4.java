import java.util.Scanner;

public class uc4  {

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");

            // Check if input is integer
            if (sc.hasNextInt()) {
                slot = sc.nextInt();

                // Validate range
                if (slot >= 1 && slot <= 9) {
                    return slot;
                } else {
                    System.out.println("Invalid input! Enter number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // clear wrong input
            }
        }
    }

    public static void main(String[] args) {
        int slot = getUserInput();
        System.out.println("You selected slot: " + slot);
    }
}    
