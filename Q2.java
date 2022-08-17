import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter x to get the area and the perimeter of the circle: ");
        x = input.nextDouble();
        System.out.println("The area of the circle is : "+( 3.14*(x*x)));
        System.out.println("The perimeter of the circle is : "+(2*3.14*(x)));
    }
}
