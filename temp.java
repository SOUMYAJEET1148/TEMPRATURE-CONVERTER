import java.util.Scanner;

public class temp {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner r1 = new Scanner(System.in);

        System.out.println("Enter 1 to convert form Celcius to Fahrenheit.");
        System.out.println("Enter 2 to convert form Fahrenheit to Celcius.");
        int choice = r1.nextInt();

        double temperature = 0.0;
        double converted = 0.0;

        if (choice == 1) {
            System.out.println("Enter the temperature in Celcius.");
            temperature = r1.nextDouble();
            converted = 9 / 5.0 * temperature + 32;
            System.out.println("Temperature in Fahrenheit= " + converted);
        }

        else if (choice == 2) {
            System.out.println("Enter the temperature in Fahrenheit.");
            temperature = r1.nextDouble();
            converted = 5 / 9.0 * (temperature - 32);
            System.out.println("Temperature in Celcius= " + converted);
        }

        else
            System.out.println("Wrong Input. Please try again.");
    }
}