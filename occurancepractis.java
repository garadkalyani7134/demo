import java.util.*;
class occurancepractis
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
		int count=1;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==a[i+1])
		{
			count++;
		}
		else
		{
			System.out.println(a[i] +" "+ count++);
			count=1;
		}
	}

}
}