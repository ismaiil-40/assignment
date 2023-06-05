

import java.util.*;
import java.lang.*;
import java.io.*;


class meanmax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int t,i,j,k,l,m,n;
		long tt,t1;
		double a1,a2;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0){
		    n = sc.nextInt();
		    int ar[] = new int[n];
		    for(i = 0; i<n; i++) ar[i] = sc.nextInt();
		    Arrays.sort(ar);
		    a1 = ar[n-1];
		    tt = 0;
		    for(i = 0; i<n-1; i++){
		        tt+= ar[i];
		    }
		    a2 = 1.000000*tt/(n-1);
		    System.out.println(a1 + a2);
	    }
	}
}