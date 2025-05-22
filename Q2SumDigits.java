import java.util.Scanner;

public class Q2SumDigits {
    public static void main(String[] args) {

        // input integer between 1 and 1000
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1000:");
        int inputInt = input.nextInt();
        
        // break integer into individual digits
        // thousands
        int thousands = inputInt / 1000;
        int remainder = inputInt % 1000;

        // hundreds
        int hundreds = remainder / 100;
        remainder = remainder % 100;

        // tens
        int tens = remainder / 10;

        // ones
        int ones = remainder % 10;

        int sum = thousands + hundreds + tens + ones;
        System.out.println(sum);
    }
}
