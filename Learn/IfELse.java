package Learn;
import java.util.Scanner;
public class IfELse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is Even");
        }
        else{
            System.out.println(a+" is Odd");
        }
        sc.close();
    }
    
}

/* Sysmtax of If else 
 
    if(Condition){

        //to execute

    }

    else{

        to execute//

    }
*/
