package Learn;

import java.util.Scanner;

public class NesteIfElse {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a==0){
            System.out.println("Zero");
        }
        else if(a>0){
            if(a%2==0){
                System.out.println("Postive even");
            }
            else{
                System.out.println("Positive odd");
            }
        }
        else{
            if(a%2==0){
                System.out.println("Negative even");
            }
            else{
                System.out.println("Negative odd");
            }
        }
        sc.close();
    }
    
}
