import java.util.Scanner;

public class Triangle_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;

        double areaInCm = areaInInches * Math.pow(2.54, 2);

        System.out.println("The area of triangle with base " + base + " inches and height " + height + " inches is "
                + areaInInches + " square inches and " + areaInCm + " square centimeters");

        input.close();
    }
}

