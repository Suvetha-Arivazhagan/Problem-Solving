import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    
	    if(a+b+c==180){
	        System.out.println("Traingle can be formed");
	    }
	    else{
	        System.out.println("Traingle cannot be formed");
	    }

	}
}
