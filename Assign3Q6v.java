public class Assign3Q6v {
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
            
            
            i = 1;
            while (i <= row * 2 - 1) {
                System.out.print(row);
                i++;
            }
            
            System.out.println();
            row++;
        } while (row <= rows);
    }
}