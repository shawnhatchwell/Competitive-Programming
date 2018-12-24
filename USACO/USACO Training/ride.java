/*
ID: shawn.h1
LANG: JAVA
PROG: ride
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;



public class ride {

	public static void main(String[] args) throws IOException {

		// Use BufferedReader rather than RandomAccessFile; it's much faster
	    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
	                                                  // input file name goes above
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
	    // Use StringTokenizer vs. readLine/split -- lots faster
	    String a=f.readLine();
	    String b=f.readLine();
	    int proda=1;
	    int prodb=1;
	    for(int i=0;i<a.length();i++){
	    	proda*=(int)a.charAt(i)-64;
	    }
	    for(int i=0;i<b.length();i++){
	    	prodb*=(int)b.charAt(i)-64;
	    }
	    if(proda%47==prodb%47)
	    	out.println("GO");
	    else
	    	out.println("STAY");
	    out.close();
	}

}
