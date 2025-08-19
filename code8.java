import java.util.*;

public class code8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int avg = (x + y + z)/3;
        System.out.println("Average of the three numbers " + x + ", " + y + ", and " + z + " is: " + avg);
        sc.close();
    }
}