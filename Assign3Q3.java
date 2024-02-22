public class Assign3Q3 {
    public static void main(String args[]) {
        int currentValue = 5;

        System.out.println("The number is: " + currentValue);

        int factorial = 1;

              //Insert your code here!


        for (int i = 1; i <= currentValue; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + currentValue + " is: " + factorial);
    }
}