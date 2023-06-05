
import java.util.*;
import java.lang.*;
import java.io.*;


class makesumeven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,i,j,k,l,m,n,o,p;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0){
		    n = sc.nextInt();
		    j = 0;
		    p = 0;
		    for(i = 0; i<n; i++){
		        k = sc.nextInt();
		        if(k%2 == 0) j++;
		        if(k == 2) p = 1;
		    }
		    m = 0;
		    o = 1;
		    l = n-j;
		    if(l%2 == 1){
		        if(j>0 && p == 1){
		            m = 1;
		        }
		        else o = 0;
		    }
		   if(o == 0) System.out.println(-1);
		   else System.out.println(m);
		}
	}
}