package com.test.demoProject;

public class PalindromeString 
{
	String word3;
	String rev="";
	
	public void Palindrome(String word3)
	{
		this.word3=word3;
		
		int l = word3.length();
		for(int j= l-1; j>=0; j--)
		{
			rev = rev + word3.charAt(j);
			
		}
		
		if(rev.equalsIgnoreCase(word3))
		{
			System.out.println("word is palindrome");
		}
		else
			System.out.println("Word is not palindrome");
	}

}
