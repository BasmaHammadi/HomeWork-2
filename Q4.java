import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to calculate the average: ");
        Scanner input = new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        System.out.println("The average of "+num1+", "+num2+", "+num3+" is: "+((num1+num2+num3)/3));
    }
}
