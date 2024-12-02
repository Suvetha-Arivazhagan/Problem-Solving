/*Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja

Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
	    Scanner sc=new Scanner(System.in);
	    String firstName=sc.next();
	    String secondName=sc.next();
	    int x=sc.nextInt();
	    
	    for(int i=1;i<=x;i++){
	        String fullName=firstName+secondName;
	        System.out.println(fullName);
	    }
	}
}
