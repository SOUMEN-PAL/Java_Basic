package Learn;
class Point{ // class defined herr //
    int x;
    int y;
}

public class Non_Prim {
    public static void main(String [] args){
        Point p = new Point();
        p.x = 10;
        Point p2 = new Point(); // i am assigning a new memory location here//
        p2.x = 20;

        int x = 9;
        int y = x;// <-- new location is created and the value is assigned //
        y = 0; // now if we change the y we cant see any changes in the value of x//


        int z = 30;
        System.out.println(z);

        System.out.println(x +" "+ y);
    }
}
