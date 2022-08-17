import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
            double l, w;
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter length and width to get the area and the perimeter of the rectangle:\nlength: ");
            l = input.nextDouble();
            System.out.print("width: ");
            w = input.nextDouble();
            System.out.println("The area of the rectangle is : "+(l*w));
            System.out.println("The perimeter of the rectangle is : "+( 2*(l+w)));
        }

    }
