import java.util.*;

public class code6 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        double si = (p * r * t) / 100.0;
        System.out.println("Simple Interest for Principal " + p + ", Rate " + r + " and Time " + t + " is: " + si);
       
        sc.close();
    }
}