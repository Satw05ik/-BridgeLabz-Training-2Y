import java.util.*;

public class code7 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int perimeter = 2 * (l + b);
        System.out.println("Perimeter of the rectangle with length " + l + " and breadth " + b + " is: " + perimeter);
        sc.close();
    }
}