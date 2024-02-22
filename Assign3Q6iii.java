public class Assign3Q6iii {
    public static void main(String args[]) {

            //Insert your code here!

        int i = 1;
        do {
            int j = 5;
            do {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print("*");
                j--;
            } while (j >= 1);
            System.out.println();
            i++;
        } while (i <= 5);
    }
}