package Learn;

import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the year: ");
        int a = sc.nextInt();

        if(a%4==0 && a%100!=0){
            System.out.println("Yes");
        }
        else if(a%400==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        sc.close();


    }
    
}
