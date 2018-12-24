import java.util.*;
import java.io.*;

public class cownomics {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("cownomics.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));
		StringTokenizer st=new StringTokenizer(f.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		String a[]=new String[n];
		String b[]=new String[n];
		for(int i=0;i<n;i++){
			a[i]=f.readLine();
		}
		for(int i=0;i<n;i++){
			b[i]=f.readLine();
		}
		int count=0;
		for(int i=0;i<m-2;i++){
			for(int j=i+1;j<m-1;j++){
				for(int k=j+1;k<m;k++){
					HashSet<Integer> hm=new HashSet<Integer>();
					for(int p=0;p<n;p++){
						int c=(int)(a[p].charAt(i))-65;
						int d=(int)(a[p].charAt(j))-65;
						int e=(int)(a[p].charAt(k))-65;	
						hm.add(c*26*26+d*26+e);
					}
					boolean g=true;
					for(int p=0;p<n;p++){
						int c=(int)(b[p].charAt(i))-65;
						int d=(int)(b[p].charAt(j))-65;
						int e=(int)(b[p].charAt(k))-65;	
						if(hm.contains(c*26*26+d*26+e)){
							g=false;
							p=m;
						}
					}
					if(g) count++;
				}
			}
		}
		
		
		//System.out.println(count);
		out.println(count);
		out.close();
	}
	
}