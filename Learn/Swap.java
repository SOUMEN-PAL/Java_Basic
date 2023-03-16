package Learn;
public class Swap {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        System.out.println("Before Swaping the values are: "+a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping the values are: "+a + " " + b);
    }
    
}
