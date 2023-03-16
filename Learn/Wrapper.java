package Learn;
public class Wrapper {

    public static void main(String [] args){
        // Integer x = new Integer(10);
        // System.out.println(x);

        Integer x1 = 10;
        Integer x2 = x1;

        x2 = 90; // wrapper class object are not referenced //

        System.out.println(x1+" "+x2);

        Integer x = 400 , y = 400;

        if(x==y){
            System.out.println("Same");
        }
        else{
            System.out.println("Not saame");
        }





    }
    
}
