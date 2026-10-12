
import java.util.Scanner;

public class CtoFConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius = 0;
        boolean done = false;

        do {
            System.out.print("Enter Celsius temperature: ");

            if (input.hasNextDouble()) {
                celsius = input.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Try again.");
                input.nextLine();
            }

        } while (!done);

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);

        input.close();
    }
}
