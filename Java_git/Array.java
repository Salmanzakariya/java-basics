import java.util.*;
 class Array  {
public static void main(String[] args)
{
Scanner sn=new Scanner(System.in);
System.out.println("enter ten number");
int a;
int []arr=new int[10];

for(int b=0;b<arr.length;b++)
{
 arr[b]=sn.nextInt();
}

int count=arr.length;
for(int i=0;i<count;i++)
{
   for(int j=i+1;j<count;j++)
   {
     if(arr[i]>arr[j])
           {
             a=arr[i];
             arr[i]=arr[j];
             arr[j]=a;
            }
    }
}
System.out.println("smallest="+arr[0]);
System.out.println("Largest="+arr[count-1]);
System.out.println("Second largest="+arr[count-2]);
}
}


       