public class Assign3Q1 {
    public static void main(String args[]) {

// Vowels: a,e,i,o,u 

        char someChar='a';

        System.out.println("Char is: " + someChar);

      //Insert your code here!

        switch(someChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The character is a vowel.");
                break;
            default:
                System.out.println("The character is a consonant.");
                break;
        }
    }
}
