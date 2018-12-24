import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class d {
	public static class FastScanner  {
	    BufferedReader br;
	    StringTokenizer st;
	    public FastScanner(Reader in) {
	        br = new BufferedReader(in);
	    }
	    public FastScanner() {
	        this(new InputStreamReader(System.in));
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
	    String readNextLine() {
	        String str = "";
	        try {
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	    }
	    int[] readIntArray(int n) {
	        int[] a = new int[n];
	        for (int idx = 0; idx < n; idx++) {
	            a[idx] = nextInt();
	        }
	        return a;
	    }
	    long[] readLongArray(int n) {
	        long[] a = new long[n];
	        for (int idx = 0; idx < n; idx++) {
	            a[idx] = nextLong();
	        }
	        return a;
	    }
	}
	public static void main(String[] args) {
		FastScanner kb=new FastScanner(new InputStreamReader(System.in));
		
		/*int dp[][]=new int[100001][(100002)/4];
		dp[0][0]=2;
		for(int i=0;i<100001;i++){
			for(int j=0;j<=i/2;j++){
				if(j==0){
					dp[i][j]=2;
				}
				else if(j*2==i){
					dp[i][j]=2*dp[i-1][j-1];
				}
				else{
					dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%1000000007;
				}
				System.out.println(i+" "+j);
			}
		}*/
		//System.out.println("DONE");
		long dp[]=new long[100001];
		dp[0]=1;
		for(int i=1;i<100001;i++){
			dp[i]=(dp[i-1]*i)%1000000007;
		}
		//System.out.println(dp[100000]);
		int t=kb.nextInt();
		for(int i=0;i<t;i++){
			int a=kb.nextInt()-1;
			int b=kb.nextInt();
			long ans=dp[a]/dp[b];
			ans/=dp[a-b];
			System.out.println(2*ans);
		}

	}

	private static int comb(int a, int b) {
		long prod=2;
		int b2=a-b;
		int bax=Math.max(b,b2);
		int bin=Math.min(b,b2);
		for(int i=a;i>bax;i--){
			int j=a-i+1;
			prod*=i;
			prod/=j;
			if(prod<0){
				System.out.println("fails at "+i);
				break;
			}
			prod=prod%1000000007;
		}
		return (int)((prod)%1000000007);
	}

}
