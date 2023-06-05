

import java.util.*;
import java.lang.*;
import java.io.*;


class nthmax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int t,i,k,l,m,n,o,p;
		long j;
		Scanner sc = new Scanner(System.in);
		 t = sc.nextInt();
		 while(t-->0){
		     n = sc.nextInt();
		     m  = sc.nextInt();
		     l = Integer.MIN_VALUE;
		     int ar[] = new int[n];
		     for(i = 0; i<n; i++){
		      ar[i] = sc.nextInt();
		      if(ar[i]>l) l = ar[i];
		     }
		     j = 0;
		     k =l;
		     for(i = 0; i<n; i++){
		         if(ar[i] == k){
		             if(i-m >-2){
		                 j+=n-i;
		             }
		         }
		     }
		     System.out.println(j);
		 }
	}
}