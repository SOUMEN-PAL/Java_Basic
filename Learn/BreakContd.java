package Learn;

import java.util.Scanner;

public class BreakContd {

    public static void main(String [] args){
        int x , y;
        Scanner s = new Scanner(System.in);

        for(int i = 0 ; i<5 ; i++){
            System.out.println("Enter x and y");
            x=s.nextInt();
            y=s.nextInt();

            if(y==0){
                continue;
            }

            System.out.println(x/y);
        }

        s.close();


        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ; j<2 ; j++){
                if(j==1){
                    break;
                }
                System.out.println(j);
            }
        }

    }
    
}
