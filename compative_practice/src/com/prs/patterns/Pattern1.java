package com.prs.patterns;

import java.util.Iterator;

public class Pattern1 {
	
	
	/*
	 * Geek is very fond of patterns. Once, his teacher gave him a square pattern to
	 * solve. He gave Geek an integer n and asked him to build a pattern.
	 * 
	 * Help Geek to build a star pattern.
	 * 
	 * 
	 * Input: 5

Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

	 * 
	 */
	

	public static void main(String[] args) {
		
		printSquare(6);
	}
	
	static void printSquare(int n) {
        
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
        
    }
	
	
}
