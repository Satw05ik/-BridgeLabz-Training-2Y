import java.util.*;

public class code5 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int h = sc.nextInt();
        double c= 3.14 * x * x * h;
        System.out.println("Volume of the cylinder with radius " + x + " and height " + h + " is: " + c);
        
        sc.close();
    }
}