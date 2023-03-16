package Learn;

import java.io.*;

public class InputBuffer {

    public static void main(String [] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s = br.readLine();

        System.out.println("You entered: "+ s);

        System.out.println("Enter a Integer");

        int x = Integer.parseInt(br.readLine());

        System.out.println("The integer is: "+x);



    }
    
}
