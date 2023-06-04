import java.util.*;
import java.lang.*;
import java.io.*;

class fastscanner
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String next()
    {
            while(st==null || !st.hasMoreTokens())
            {
            try{
                    
                st=new StringTokenizer(br.readLine());
            }
        catch(IOException e){}
            }
        return st.nextToken();
    }
    int nextInt()
    {
        return Integer.parseInt(next());
    }
    float nextFloat()
    {
        return Float.parseFloat(next());
    }
    long nextLong()
    {
        return Long.parseLong(next());
    }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    String nextLine()
    {
        String s="";
        try{
            s=br.readLine();
        }
        catch(IOException e){}
        return s;
    }
}




class oddrepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		fastscanner input=new fastscanner();
		PrintWriter output=new PrintWriter(System.out);
		int t=input.nextInt();
		while(t-- !=0)
		{
		  long n=input.nextLong();
		  long k=input.nextLong();
		  long s=input.nextLong();
		  
		  long sum=0;
		  
		  sum=(long)(Math.pow(n,2));
		  long ans=0,j=1;
		  
		  for(int i=1;i<=n;i++)
		  {
		    if(((sum-j)+(k*j))==s)
		    {
		      ans=j;
		      break;
		    }
		    j=j+2;
		  }
		  
		  output.println(ans);
		}
		output.flush();
	}
}