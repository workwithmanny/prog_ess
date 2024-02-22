public class Assign3Q5 {
    public static void main(String args[]) {
        
              //Insert your code here!

        int currentValue = 5;
        int factorial = 1;
        int i = 1;

        System.out.println("The number is: " + currentValue);

        while (i <= currentValue) {
            factorial *= i;
            i++;
        }

        System.out.println("The factorial of " + currentValue + " is: " + factorial);
    }