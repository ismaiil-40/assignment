
import java.util.*;
import java.lang.*;
import java.io.*;


class votes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- >0)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int a[]= new int[n];
		    int b[]= new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        if(a[i]==i+1)
		        {
		            b[i]=-1;
		        }
		        else if(b[a[i]-1]!=-1 &&a[i]!=i+1)
		        {
		            b[a[i]-1]++;
		        }
		    }
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        if(b[i]>=k)
		        {
		            c++;
		        }
		      //  System.out.print(b[i]+" ");
		    }
		    System.out.println(c);
		    
		}
	}
}