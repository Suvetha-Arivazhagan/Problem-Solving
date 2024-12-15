/*
Write a program that gets n as input and print the reverse of the number

Testcase 1 :

Input : 

325345

Expected output:

543523


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
		int rev=0;
		while(n>0){
		    rev=rev*10+(n%10);
		    n=n/10;
		}
		System.out.println(rev);
		
	}
}
