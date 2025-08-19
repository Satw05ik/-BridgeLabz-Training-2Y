import java.util.*;

public class code9 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int k = sc.nextInt();
        double m = k * 0.621371; // Convert kilometers to miles
        System.out.println("Distance in miles: " + m);
        
        sc.close();
    }
}