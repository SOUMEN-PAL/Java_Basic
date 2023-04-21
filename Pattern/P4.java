package Pattern;

public class P4 {
    public static void main(String [] args){
        for(int i = 0 ; i<5 ; i++){
            for(int j = i ; j<4 ; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k<2*i+1 ; k++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
    
}
