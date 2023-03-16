package Learn;
import java.util.Scanner;
public class Operators {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String usr = "gekk" , pwd = "Geek";
        String u = sc.next();
        String p = sc.next();

        if(usr.equals(u) && pwd.equals(p)){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Try again");
        }   
           

    }
    
}
