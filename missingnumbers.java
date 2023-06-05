
import java.util.*;
import java.lang.*;
import java.io.*;


class missingnumbers
{
   
	public static void main (String[] args) throws java.lang.Exception
	{
		PrintWriter out = new PrintWriter(System.out);
		FastReader sc = new FastReader();
		int testCases = sc.nextInt();
		while(testCases-->0){
		    int arr[]=new int[4];
		    for(int i=0;i<4;i++) arr[i]=sc.nextInt();
		    Arrays.sort(arr);
		    int a[] = find(arr);
		    out.println(a[0]+" "+a[1]);
		}
		out.close();
	}
	public static int[] find(int arr[]){
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++){
	            if(i==j) continue;
	            int x = arr[i]+arr[j];
	            int y = arr[i]-arr[j];
	            if(x%2==1||y%2==1) continue;
	            int a=x/2 , b=y/2;
	            if(inr(a) && inr(b)){
	                for(int p=0;p<4;p++){
	                    if(i==p || j==p ||arr[p]  != a/b) continue;
	                    for(int q=0;q<4;q++){
	                        if(i==q || j==q || q==p || arr[q] != a*b) continue;
	                        return new int[]{a,b};
	                    }
	                }
	            }
	        }
	    }
	    return new int[]{-1,-1};
	}
	public static boolean inr(int x){
	    return x>=1 && x<=10000;
	}
}


class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(
				new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
