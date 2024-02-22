public class Assign3Q6vi {
    public static void main(String[] args) {

            //Insert your code here!

        int rows = 5;
        int row = 1;
        
        do {
            int spaces = rows - row;
            int num = row;
            
            int i = 1;
            while (i <= spaces) {
                System.out.print(" ");
                i++;
            }
            
            i = row;
            while (i >= 1) {
                System.out.print(i);
                i--;
            }
            
            i = 2;
            while (i <= row) {
                System.out.print(i);
                i++;
            }
            
            System.out.println();
            row++;
        } while (row <= rows);
    }
}