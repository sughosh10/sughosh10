package com.test.demoProject;

public class TestGitIntergration {

	public static void main(String[] args) 
	{
		
		ReverseString obj1 = new ReverseString();
		ReverseString obj2 = new ReverseString();
		PalindromeString obj3= new PalindromeString();
		obj1.ReverseWord("DREAM");
		
		StringBuffer sb = obj2.StringRevWithStringBuffer("WORLD");
		System.out.println("String buffer way " + sb);
		
		obj3.Palindrome("MADAM");
		
		

	}

}
