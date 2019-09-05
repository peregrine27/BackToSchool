import java.io.*;
import java.util.Scanner;
public class Chain
{
    public static void main(String args[])
    {
        int tc,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        tc=sc.nextInt();
		if(tc<1000)
        {while(i++<tc)
        {
         String chain;
        System.out.println("Enter the chain design");
        chain=sc.next();
        int l=chain.length();
		if(l>0 && l<=100)
		{
		int flag=0;
		if(l==1)
		{
			if(chain.charAt(0)=='*')
			System.out.println("Strong!"); 	
		    else
				System.out.println("Not Strong");
			continue;
		}
			
        
        for(int j=0,k=1;j<l;j+=2,k+=2)
        {
            if(chain.charAt(j)!='*' && chain.charAt(k)!='-')
            {
                flag=1;
                break;
            }
			if(j<=l-2)
				{
			if(chain.charAt(j)==chain.charAt(j+1))
			{
				 flag=1;
                break;
			}
				}
				if(j<=l-3){
			if(chain.charAt(j)!='*' && chain.charAt(j+1)!='-' && chain.charAt(j+2)!='*')
			{
				
				 flag=1;
                break;
			}
				}
            
        }
        if(flag==1)
        System.out.println("Not Strong!");
        else
        System.out.println("Strong");
	  
        }
		}
		}
		else System.out.println("The number of test cases exceeds the limit");
   }
}