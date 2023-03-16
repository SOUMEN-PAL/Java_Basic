package Learn;
import java.util.Scanner; // always after the the package statements //

public class InputScanner {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Integer");
        int a = s.nextInt();
        System.out.println(a);
        s.nextLine(); // by consuming the leftover new line using the nextLine() method//
        // The explanation is: https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/ //
        System.out.println("Enter the string");
        String b = s.nextLine(); // takes all the string including the spaces //
        System.out.println(b);

        System.out.println("Enter the decimal value");
        float f = s.nextFloat();
        System.out.println(f);
        s.close();
        
    }


}


//This issue occurs because, when nextInt() method of Scanner class is used to read the age of the person, it returns the value 1 to the variable age, as expected. But the cursor, after reading 1, remains just after it.


