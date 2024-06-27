/*merge intervals 
sample example 1:
input:
9
4 1 3 2 6 8 10 15 18
output:
1 2 6 8 10 15 18

sample example 2:
input:
5
2 1 4 4 5
output:
1 4 5*/
import java.util.*;
class MergeIntervals
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
for(int i=0;i<n-1;i++)
{
if(a[i]<a[i+1])
{
	System.out.print(a[i]+" ");
}
}
System.out.print(a[n-1]);
}
}

	