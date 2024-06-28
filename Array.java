/*input:
n=6
45 12 66 24 39 76 
output:
12 24 39 45 66 76
76 66 45 12 24 39*/

import java.util.*;
class Array
{
	public static void main(String args[])
	{
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
Arrays.sort(a);
for(int i=n-1;i>=n/2;i--)
{
	System.out.print(a[i]+" ");
}
for(int i=0;i<n/2;i++)
{
	System.out.print(a[i]+" ");
}
}
}
		