/*
ID: shawn.h1
LANG: JAVA
PROG: gift1
*/
import java.io.*;
import java.util.*;

class gift1 {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    int n=Integer.parseInt(f.readLine());
    HashMap<String,Integer> names=new HashMap<String,Integer>();
    String namesArr[]=new String[n];
    for(int i=0;i<n;i++){
    	String wut=f.readLine();
    	names.put(wut, 0);
    	namesArr[i]=wut;
    }
    for(int i=0;i<n;i++){
    	String name=f.readLine();
    	StringTokenizer nums=new StringTokenizer(f.readLine());
    	int mon=Integer.parseInt(nums.nextToken());
    	int ppl=Integer.parseInt(nums.nextToken());
    	if(ppl>0)
    		names.put(name, names.get(name)-(mon/ppl)*ppl);
    	for(int j=0;j<ppl;j++){
    		String name2=f.readLine();
    		names.put(name2, names.get(name2)+(mon/ppl));
    	}
    }
    for(int i=0;i<n;i++){
    	out.println(namesArr[i]+" "+names.get(namesArr[i]));
    }
                             // output result
    out.close();                                  // close the output file
  }
}