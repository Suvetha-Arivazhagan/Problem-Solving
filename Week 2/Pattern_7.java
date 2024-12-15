/*
Sample 1:

Input:

n = 4

Expected output:

4321

321

21

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
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
		    for(int j=i;j>=1;j--){
		        System.out.print(j);
		    }
		    System.out.println();
		}

	}
}
