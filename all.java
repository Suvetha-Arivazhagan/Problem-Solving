//Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
//Input:  2 Name y
//Expected Output:
//2

//Name

//y

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
	    Scanner sc=new Scanner(System.in);
	    int i=sc.nextInt();
	    String s=sc.next();
	    char c=sc.next().charAt(0);
	    
	    System.out.println(i);
	    System.out.println(s);
	    System.out.println(c);
	    

	}
}
