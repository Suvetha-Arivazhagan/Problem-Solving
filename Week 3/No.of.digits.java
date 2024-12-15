/*
Write a program that gets n as input and print the number of digits in the number

Testcase 1 :

Input : 

325345

Expected output:

6


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0){
		    int ld=n%10;
		    count++;
		    n=n/10;
		}
		System.out.println(count);
	}
}
