/*
Write a Program to find the smallest element in the Array

Input: 

n = 5

1 3 5 7 8

Ouput Expected:

1

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    
		}
		int small=arr[0];
		for(int i=0;i<n;i++){
		    if(arr[i]<small){
		        small=arr[i];
		    }
		}
		System.out.println(small);

	}
}
