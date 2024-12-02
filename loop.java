/*Prob 1:

Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3

Expected Output

2

2

2

Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output.*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
	    Scanner sc=new Scanner(System.in);
	    int X=sc.nextInt();
	    int Y=sc.nextInt();
	    
	    for(int i=1;i<=Y;i++){
	        System.out.println(X);
	    }
	}
}
