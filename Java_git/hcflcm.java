import java.util.Scanner;
class hcflcm
 {
 public static void main(String args[])
 {
 int temp1,temp2,num1,num2,temp,hcf,lcm;
  Scanner Scanner=new Scanner(System.in);
  System.out.println("Enter the first number:");
  num1=Scanner.nextInt();
  System.out.println("Enter the second number:");
  num2=Scanner.nextInt();
  Scanner.close();
  temp1=num1;
  temp2=num2;
  while(temp2!=0)
 {
 temp=temp2;
 temp2=temp1%temp2;
 temp1=temp;
 }
   hcf=temp1;
   lcm=(num1*num2)/hcf;
 System.out.println("HCF of input numbers:"+hcf);
 System.out.println("LCM of input numbers:"+lcm);
}
}