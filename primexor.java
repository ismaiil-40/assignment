

import java.util.*;
import java.lang.*;
import java.io.*;


class primexor
{  static class FastReader
	{
	    BufferedReader br;
	    StringTokenizer st;
	    public FastReader()
	    {
	        br=new BufferedReader(new InputStreamReader(System.in));
	    }
	    String next()
	    {
	        while(st==null || !st.hasMoreElements())
	        {
	            try {
	                st=new StringTokenizer(br.readLine());
	            } catch(IOException e) {
	                e.printStackTrace();
	            } 
	        }
	        return st.nextToken();
	    }
	    int nextInt()
	    {
	        return(Integer.parseInt(next()));
	    }
	    long nextLong()
	    {
	        return(Long.parseLong(next()));
	    }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader in = new FastReader();
		int t = in.nextInt();
	    
	    StringBuilder sb = new StringBuilder();
		while(t-- > 0) {
		    long x = in.nextLong();
		    long y = in.nextLong();
		    long z = x ^ y;
		    long [] arr = new long[3];
		    arr[0] = 2;
		    
		    if ((x % 2 != 0) && (y % 2 != 0)) {
		        arr[1] = 2 ^ x;
		        arr[2] = 2 ^ y;
		    } else if ((x % 2 != 0) && (z % 2 != 0)) {
		        arr[1] = 2 ^ x;
		        arr[2] = 2 ^ z;
		    } else if ((y % 2 != 0) && (z % 2 != 0)) {
		        arr[1] = 2 ^ y;
		        arr[2] = 2 ^ z;
		    } else {
		        
		    }
		   Arrays.sort(arr);
		   sb.append(arr[0]+" "+arr[1]+" "+arr[2]+"\n");
		}
		System.out.println(sb);	
	}
}