import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers: ");
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt(), num2= input.nextInt();
        System.out.println(num1+"+"+num2+" = "+(num1+num2));
        System.out.println(num1+"-"+num2+" = "+(num1-num2));
        System.out.println(num1+"*"+num2+" = "+(num1*num2));
        System.out.println(num1+"-"+num2+" = |"+(num1-num2)+"| = "+(Math.abs(num1-num2)));
        System.out.println("The max of "+num1+" and "+num2+" is "+(Math.max(num1,num2)));
        System.out.println("The min of "+num1+" and "+num2+" is "+(Math.min(num1,num2)));
    }
}
