import java.util.*;
class missingelementpractis
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.println("Enter array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
int temp;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i:a)
{
System.out.println(i);
}
for(int i=0;i<a.length-1;i++){
	for(int j=a[i]+1;j<a[i+1];j++)
	{
		System.out.println("missing element:"+j);
	}
}



}
}