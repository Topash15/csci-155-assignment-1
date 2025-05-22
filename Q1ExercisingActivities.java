import java.util.Scanner;

public class Q1ExercisingActivities {
    public static void main(String[] args) {

        // take input hours
        Scanner bicyclingInput = new Scanner(System.in);
        Scanner joggingInput = new Scanner(System.in);
        Scanner swimmingInput = new Scanner(System.in);
        System.out.println("Enter hours biked:");
        double bicyclingHours = bicyclingInput.nextDouble();
        System.out.println("Enter hours jogged:");
        double joggingHours = joggingInput.nextDouble();
        System.out.println("Enter hours swam:");
        double swimmingHours = swimmingInput.nextDouble();

        // Convert to calories/hour
        // 200 for bicycling
        double bicyclingCal = bicyclingHours * 200;
        // 475 for jogging
        double joggingCal = joggingHours * 475;
        // 275 for swimming
        double swimmingCal = swimmingHours * 275;

        // divide each by 3500 to convert to lbs
        double bicyclingWeight = bicyclingCal / 3500;
        double joggingWeight = joggingCal / 3500;
        double swimmingWeight = swimmingCal / 3500;

        // return each
        System.out.println(
                "Bicycling: \n Calories burned: " + bicyclingCal + " calories. \n Weight lost: " + bicyclingWeight
                        + " lbs. \n");
        System.out.println(
                "Jogging: \n Calories burned: " + joggingCal + " calories. \n Weight lost: " + joggingWeight
                        + " lbs. \n");
        System.out.println(
                "Swimming: \n Calories burned: " + swimmingCal + " calories. \n Weight lost: " + swimmingWeight
                        + " lbs. \n");
        System.out.println("Total: \n Calories burned:  " + (bicyclingCal + joggingCal + swimmingCal)
                + " calories. \n Weight lost: " + (bicyclingWeight + joggingWeight + swimmingWeight) + " lbs.");
    }
}