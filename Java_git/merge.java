import java.util.Scanner;
class merge
{
public static void main(String[] args)
{
int n1,n2,k;
int c[]=new int[50];
Scanner sn=new Scanner(System.in);
System.out.println("Enter no of elements in 1st array");
n1=sn.nextInt();
int a[]=new int[n1];
System.out.println("Enter elements 1st array");
for(int i=0;i<n1;i++)
  {
   a[i]=sn.nextInt();
   c[i]=a[i];
   }
k=n1;
System.out.println("Enter no of elements in 2nd array");
n2=sn.nextInt();
int b[]=new int[n2];
System.out.println("Enter elements 2nd array");
for(int i=0;i<n2;i++)
{
b[i]=sn.nextInt();
c[k]=b[i];
k++;
}
System.out.println("Merged array");
for(int i=0;i<k;i++)
{
System.out.println(" "+c[i]);
}
}
}


