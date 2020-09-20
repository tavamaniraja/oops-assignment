/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*; 

class Main { 
	
	 
	static double sum(int n) 
	{ 
	double i, s = 0.0; 
	for (i = 1; i <= n; i++) 
		s = s + 1/i; 
	return s; 
	} 

	

	public static void main(String args[]) 
	{ 
		int n = 5; 
		System.out.printf("Sum is %f", sum(n));		 
	} 
} 
