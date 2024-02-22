public class Assign3Q2 {
    public static void main(String args[]) {
        String currentMonth = "January";

        System.out.println("The current month is: " + currentMonth);

      //Insert your code here!


        switch (currentMonth.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("Number of days: 31");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("Number of days: 30");
                break;
            case "february":
                System.out.println("Number of days: 28 or 29 (leap year)");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
