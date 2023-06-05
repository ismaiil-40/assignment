
import java.util.*;
import java.lang.*;
import java.io.*;


class permutationsubseq
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-->0)
		{
		    int  n = scn.nextInt();
		    HashMap<Long,Long> map = new HashMap<>();
		    for(int i=0;i<n;i++)
		    {
		        long a = scn.nextInt();
		        map.put(a,map.getOrDefault(a,0l)+1) ;
		    }
		    long ans = 0;
		    long key = 1;
		    long k = 1;
		    while(key <= 1000000000)
		    {
		        if(map.containsKey(key)==true)
		        {
		            k = (k * map.get(key))%1000000007;
		            ans = (ans + k) %1000000007;
		        }
		        else
		        break;
		        key++;
		    }
		    System.out.println(ans);
		}
	}
}