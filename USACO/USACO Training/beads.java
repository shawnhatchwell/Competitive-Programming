/*
ID: shawn.h1
LANG: JAVA
PROB: beads
*/
import java.io.*;
import java.util.*;


public class beads {

	public static void main(String[] args) throws IOException {
		// Use BufferedReader rather than RandomAccessFile; it's much faster
	    Scanner kb=new Scanner(System.in);
		BufferedReader f = new BufferedReader(new FileReader("beads.in"));
	                                                  // input file name goes above
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
	    // Use StringTokenizer vs. readLine/split -- lots faster
	    int n=Integer.parseInt(f.readLine());
	    //int n=Integer.parseInt(kb.nextLine());
	    String s=f.readLine();
	    //String s=kb.nextLine();
	    int[] q=new int[n];
	    //i is center, j goes along
	    for(int i=0;i<n;i++){
	    	char x=s.charAt(i);
	    	int j=1;
	    	while(s.charAt((i+j)%n)==x||s.charAt((i+j)%n)=='w'||x=='w'){
	    		if(x=='w'){
	    			if(s.charAt((i+j)%n)!='w'){
	    				x=s.charAt((i+j)%n);
	    			}
	    			j++;
	    		}
	    		else{
	    			j++;
	    		}
	    		if(j>n){
	    			break;
	    		}
	    	}
	    	x=s.charAt((i-1+2*n)%n);
	    	int k=1;
	    	while(s.charAt((i-k-1+2*n)%n)==x||s.charAt((i-k-1+2*n)%n)=='w'||x=='w'){
	    		if(x=='w'){
	    			if(s.charAt((i-k-1+2*n)%n)!='w'){
	    				x=s.charAt((i-k-1+2*n)%n);
	    			}
	    			k++;
	    		}
	    		else{
	    			k++;
	    		}
	    		if(k>n){
	    			break;
	    		}
	    	}
	    	if(j+k>n)
	    		q[i]=n;
	    	
	    	else
	    		q[i]=j+k;
	    }
	    int m=0;
	    for(int z:q)
	    	if(z>m)
	    		m=z;
	    //System.out.println(m);
	    out.println(m);
	    out.close();
	}

}
