/*inversion count:let j and k be two indices in an array A.if j<k and A[j]>A[k],
then the pair 
example:
input:
n:5
A:1 20 6 4 5
ouput:5
explaination:the inversion pair in array A are(20,6),(20,4),(20,5),(6,4) and(6,5),
the count of the inversions are 5,hence 5 is returned*/
import java.util.*;
class Count{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int c=0;
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
c++;
}
}
}
System.out.print(c);
}
}
