import java.util.*;

public class code3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int c= (x*9/5)+32;
        System.out.println("Temperature in Fahrenheit: " + c);
        sc.close();
    }
}