package com.programs;
public class Merge
{
	public static void main(String[] args)
	{
		int a[]= {2,4,1,5,7,4,4,7};
		int b[]= {7,8,5,4,4,5,7,7};
		int c[]=new int[a.length+b.length];
		int i,j,count=0;
		//merge two arrays
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i];
			count++;
		}
		for(j=0;j<b.length;j++)
		{
			c[count++]=b[j];
		}
		//sorting
		int k=c.length;
		for(i=0;i<k;i++)
		{
			for(j=i+1;j<k;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		//remove duplicates
		int x=0;
		c[x]=c[0];
		for(i=0;i<k;i++)
		{
			if(c[x]!=c[i])
			{
				x++;
				c[x]=c[i];
			}
		}
		System.out.println("After removing duplicates");

		for(i=0;i<=x;i++)
		{
			System.out.println(c[i]);
		}
	}

}
