package Learn;
public class TypeConver {

    public static void main(String [] args){
        // Implicit conversion //
        byte x = 10;
        short y = x;
        int z = y;
        System.out.print("Implicit Conversion: ");
        System.out.println(z);

        // Explicit Conversion //
        float m = 10.55f;
        int n = (int) m;
        System.out.print("Explicit Conversion: ");
        System.out.println(n);
    }
    
}
