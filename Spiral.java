import java.util.*;
public class Spiral
{  public static void main(String args[])
     {  
		int m,n;
		 Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the rows and column");
		m=sc.nextInt();
		n=sc.nextInt();
		int[][]A= new int[m][n];
		int k=1, c1=0, c2=n-1, r1=0, r2=n-1;

		
		while(k<=m*n)
                {
                    for(int i=c1;i<=c2;i++)
                    {
                        A[r1][i]=k++;
                    }

                    for(int j=r1+1;j<=r2;j++)
                    {
                        A[j][c2]=k++;
                    }

                    for(int i=c2-1;i>=c1;i--)
                    {
                        A[r2][i]=k++;
                    }

                    for(int j=r2-1;j>=r1+1;j--)
                    {
                        A[j][c1]=k++;
                    }

                 c1++;
                 c2--;
                 r1++;
                 r2--;
                }
				//printing the circular matrix
				for(int i=0;i<m;i++)
				{ for(int j=0;j<n;j++)
					{ System.out.print(A[i][j]+"\t");
					}
					System.out.println(" ");
				}
	 }
}

				
  
		
		
			  
		
		
		
		

		