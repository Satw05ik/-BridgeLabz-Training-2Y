import java.util.*;

public class code4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        double p = 3.14 * x * x; // Assuming x is the radius of a circle
        System.out.println("Area of the circle with radius " + x + " is: " + p);
        sc.close();
    }
}