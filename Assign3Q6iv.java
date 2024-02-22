public class Assign3Q6iv {
    public static void main(String[] args) {

            //Insert your code here!

        int rows = 5;
        int spaces = rows - 1;

        int i = 1;
        do {
            int j = 1;
            
          
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }
            
           
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            
            System.out.println();
            spaces--;
            i++;
        } while (i <= rows);
    }
}