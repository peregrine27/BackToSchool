//import java.io.*;
import java.util.*;
public class Palindrome
{ 
    public static void main(String args[])
	{ int n,temp,t;
			Scanner sc= new Scanner(System.in);
			do
			{  System.out.println("Enter the number which has to be checked for palindrome\nENTER 999 for exiting the loop\n");
			   n=sc.nextInt();
			   temp=n;
			   t=0;
			   int d;
			   if(n!=999)
			   {while(temp!=0)
			   {
				   d=temp%10;
				   t=t*10+d;
				   temp/=10;
			   }
			   if(n==t)
				   System.out.println(n+" "+"is PALINDROME\n");
				else
					System.out.println("Entered number not PALINDROME,try for another one\n");
			   }
			   else
			   System.out.println("OHHH....YOU ENTERED 999..!!!");
			}while(n!=999);
			System.out.println( Math.pow(-2,-3));
	}
}
				   
				  