import java.util.Scanner;
class Calculator
{
    public static void main(String[] args) {
      
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        float quo =(float) num1 / num2;
        int rem = num1 % num2;
        
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + quo);
        System.out.println("Remainder = " + rem);
    }
}