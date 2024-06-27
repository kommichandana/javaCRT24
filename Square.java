/*Squares of a sorted Array
given an integer array arr of size n sorted in non decresing order,return an array of the squares
of each number sorted in non-decreasing order.
sample input:
arr={-4,-1,0,3,10}
output:
0 1 9 16 100
explanation:
after squaring,the array becomes [16,1,0,9,100].
after sorting,it becomes [0,1,9,16,100].*/
import java.util.*;
class Square{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int c[]=new int[n];
for(i=0;i<n;i++)
{
c[i]=a[i]*a[i];
}
Arrays.sort(c);
for(i=0;i<n;i++)
{
System.out.print(c[i]+" ");
}
}
}

