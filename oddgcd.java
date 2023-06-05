

import java.util.*;
import java.lang.*;
import java.io.*;

class oddgcd
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    boolean ans=false;
		    long arr[]=new long[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextLong();
		        if(arr[i]%2!=0){
		            ans=true;
		        }
		    }
		    if(ans){
		        System.out.println(0);
		    }
		    else{
		        long c=0;
		        for(int i=0;i<n;i++){
		            int k=0;
		            long x=arr[i];
		            while(x>1){
		                if(x%2==0){
		                    k++;
		                }
		                else{
		                    break;
		                }
		                x=x/2;
		            }
		             if(i==0) {
	            	     c=k;
	                 }
	                  else {
	                       c=Math.min(c,k);
	                  }
		        }
		        System.out.println(c);
		    }
		}	
	}
}