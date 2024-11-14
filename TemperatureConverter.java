import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the scale to convert from:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int fromScale = scanner.nextInt();

        System.out.println("Select the scale to convert to:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int toScale = scanner.nextInt();

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        double result = 0.0;

        if (fromScale == 1) {
            if (toScale == 2) {
                result = (temperature * 9/5) + 32;
            } else if (toScale == 3) {
                result = temperature + 273.15;
            } else {
                result = temperature;
            }
        } else if (fromScale == 2) {
            if (toScale == 1) {
                result = (temperature - 32) * 5/9;
            } else if (toScale == 3) {
                result = (temperature - 32) * 5/9 + 273.15;
            } else {
                result = temperature;
            }
        } else if (fromScale == 3) {
            if (toScale == 1) {
                result = temperature - 273.15;
            } else if (toScale == 2) {
                result = (temperature - 273.15) * 9/5 + 32;
            } else {
                result = temperature;
            }
        }

        System.out.println("Converted temperature: " + result);
        scanner.close();
    }
}
