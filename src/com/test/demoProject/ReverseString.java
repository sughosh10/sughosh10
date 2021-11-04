package com.test.demoProject;

public class ReverseString {
	
	String word;
	String reverse= "";
	
	public void ReverseWord(String word)
	{
		this.word=word;
		
		
		int len = word.length();
		
		for(int i=len-1; i>=0;i--)
		{
		 reverse = reverse + word.charAt(i);	
		}

		System.out.println(reverse);
	}

	public StringBuffer StringRevWithStringBuffer(String word2)
	{
		StringBuffer strbuf = new StringBuffer(word2);
		
		return strbuf.reverse();
	}

	

}
