package com.programs;
import java.util.Scanner;
class Anagram
{
	public static void main(String args[])
	{
		int found,not_found=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First String:");
		String str1=s.nextLine();
		System.out.println("Enter Second String:");
		String str2=s.nextLine();
		int len1=str1.length();
		int len2=str2.length();
		if(len1==len2)
		{
			int len=len1;
			for(int i=0;i<len;i++)
			{
				found=0;
				for(int j=0;j<len;j++)
				{
					if(str1.charAt(i)==str2.charAt(j))
					{
						found=1;
						break;
					}
				}
				if(found==0)
				{
					not_found=1;
					break;
				}
			}
			if(not_found==1)
			{
				System.out.println("Strings are not anagram to each other");
			}
			else
			{
				System.out.println("Strings are anagram");
			}
		}
		else
		{
			System.out.println("Both Strings must have same length");
		}
	}
}

			
					