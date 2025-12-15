import java.util.Arrays;
import java.util.Scanner;
class Array
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter number of elements:");
int n=obj.nextInt();
int a[]=new int[n];
System.out.println("enter the elements:");
for(int i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
Arrays.sort(a);
System.out.println("sorted array");
for(int num:a)
{
System.out.print(num+" ");
}
}
}
