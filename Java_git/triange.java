import java.util.*;
import java.lang.Math;
 class triangle { 
 public static void main(String[] args) {
 Scanner sn=new Scanner(System.in);
System.out.println("Enter three sides");
int a=sn.nextInt();
int b=sn.nextInt();
int c=sn.nextInt();
  

 if (a == b && b == c) { 
 System.out.println("Equilateral triangle"); 
 } else if (a == b || b == c || a == c) { 
 System.out.println("Isosceles triangle"); 
 } else { 
 System.out.println("Scalene triangle"); 
 } 
 double s = (a + b + c) / 2; 
 double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
 System.out.println("Area: " + area); 
 }
}

