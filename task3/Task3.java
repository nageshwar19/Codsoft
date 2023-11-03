import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoding exchange rates for simplicity, in reality, you would fetch them from an API
        double usdToEuroRate = 0.85;
        double usdToGBP = 0.74;

        System.out.println("Currency Converter");

        System.out.print("Enter the base currency (USD, EUR, GBP, etc.): ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (USD, EUR, GBP, etc.): ");
        String targetCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the amount in " + baseCurrency + ": ");
        double amount = scanner.nextDouble();

        double result = convertCurrency(amount, baseCurrency, targetCurrency, usdToEuroRate, usdToGBP);

        System.out.println("Converted amount in " + targetCurrency + ": " + result);
    }

    public static double convertCurrency(double amount, String baseCurrency, String targetCurrency, double usdToEuroRate, double usdToGBP) {
        if (baseCurrency.equals("USD")) {
            if (targetCurrency.equals("EUR")) {
                return amount * usdToEuroRate;
            } else if (targetCurrency.equals("GBP")) {
                return amount * usdToGBP;
            }
        }

        // Add more currency conversion options as needed

        System.out.println("Unsupported currency pair.");
        return -1.0;
    }
}


