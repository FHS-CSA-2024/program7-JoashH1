import java.util.Scanner;

public class CurrencyConverter {
    // Conversion rates as final variables
    private static final int KLEVINS_PER_SCHRUTE_BUCK = 20;
    private static final int STANLEY_NICKELS_PER_KLEVIN = 12;
    private static final int STANLEY_NICKELS_PER_SCHRUTE_BUCK = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for schrute-bucks, klevins, and stanley-nickels
        System.out.print("Enter schrute-bucks: ");
        int schruteBucks = scanner.nextInt();

        System.out.print("Enter klevins: ");
        int klevins = scanner.nextInt();

        System.out.print("Enter stanley-nickels: ");
        int stanleyNickels = scanner.nextInt();

        // Convert the old monetary system to decimal schrute-bucks
        double totalStanleyNickels = (schruteBucks * KLEVINS_PER_SCHRUTE_BUCK * STANLEY_NICKELS_PER_KLEVIN)
                                   + (klevins * STANLEY_NICKELS_PER_KLEVIN)
                                   + stanleyNickels;

        double decimalSchruteBucks = totalStanleyNickels / STANLEY_NICKELS_PER_SCHRUTE_BUCK;

        // Output the result
        System.out.println("----------------------------");
        System.out.printf("Decimal schrute-bucks = $%.2f%n", decimalSchruteBucks);

        // Close the scanner
        scanner.close();
    }
}
