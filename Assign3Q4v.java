public class Assign3Q4v {
    public static void main(String args[]) {

            //Insert your code here!

        int rowCount = 5;
        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= rowCount - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}