package Learn;
import java.util.Scanner;

public class DayBeN {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int x = n%7;
        int ans = d-x;

        if(ans<0){
            System.out.println(ans+7);
        }
        else{
            System.out.println(ans);
        }


    }
    
}
