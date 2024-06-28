import java.util.*;
class MergeSortSum
{
static void MergeSort(int a[],int n)
{
if(n<2)
return;
int mid=n/2;
int l[]=new int[mid];
int r[]=new int[n-mid];
for(int i=0;i<mid;i++)
{
l[i]=a[i];
}
for(int i=mid;i<n;i++)
{
r[i-mid]=a[i];
}
MergeSort(l,mid);
MergeSort(r,n-mid);
merge(a,l,r,mid,n-mid);
}
static void merge(int a[],int l[],int r[],int left,int right)
{
int i=0,j=0,k=0;
while(i<left && j<right)
{
if(l[i]<r[j])
{
a[k++]=l[i++];
}
else
{
a[k++]=r[j++];
}
}
while(i<left)
{
a[k++]=l[i++];
}
while(j<right)
{
a[k++]=r[j++];
}
}
	public static void main(String args[])
	{
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
MergeSort(a,n);
for(int i=0;i<n;i++)
{
	System.out.print(a[i]+" ");
}
}
}
		