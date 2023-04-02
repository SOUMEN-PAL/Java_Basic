package Learn;

import java.util.Scanner;

public class Count {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int res = num;
        int x = 0;
        int count=0;
        while(num!=0){
            int z = num%10;
            count++;
            x = x*10 + z;

            num = num/10;

        }
        System.out.printf("The reverse of the number is %d and the no of digits in it is %d\n",x,count);
        System.out.println((int)Math.floor(Math.log10(res)+1));
        sc.close();
    }    
}
