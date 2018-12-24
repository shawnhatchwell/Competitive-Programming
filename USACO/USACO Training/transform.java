import java.util.*;
import java.io.*;

/*
ID: shawn.h1
LANG: JAVA
PROB: transform
*/
public class transform {
	public static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		f = new BufferedReader(new FileReader("transform.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
		
		n=Integer.parseInt(f.readLine().trim());
		char[][] or=new char[n][n];
		char[][] tf=new char[n][n];
		for(int i=0;i<n;i++){
			String s=f.readLine();
			for(int j=0;j<n;j++){
				or[i][j]=s.charAt(j);
			}
		}
		for(int i=0;i<n;i++){
			String s=f.readLine();
			for(int j=0;j<n;j++){
				tf[i][j]=s.charAt(j);
			}
		}
		String as="";
		if(c1(or,tf)){
			as="1";
		}
		else if(c2(or,tf)){
			as="2";
		}
		else if(c3(or,tf)){
			as="3";
		}
		else if(c4(or,tf)){
			as="4";
		}
		else if(c51(or,tf)||c52(or,tf)||c53(or,tf)){
			as="5";
		}
		else if(c6(or,tf)){
			as="6";
		}
		else{
		//#7: Invalid Transformation: The new pattern was not obtained by any of the above methods.
			as="7";
		}
		System.out.println(as);
		out.println(as);
		out.close();
	}
	public static boolean c1(char[][] or, char[][] tf){
		//#1: 90 Degree Rotation: The pattern was rotated clockwise 90 degrees.
		boolean b=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(or[i][j]!=tf[j][n-i-1]){
					b=false;
				}
			}
		}
		return b;
	}
	public static boolean c2(char[][] or, char[][] tf){
		//#2: 180 Degree Rotation: The pattern was rotated clockwise 180 degrees.
		boolean b=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(or[i][j]!=tf[n-i-1][n-j-1]){
					b=false;
				}
			}
		}
		return b;
	}
	public static boolean c3(char[][] or, char[][] tf){
		//#3: 270 Degree Rotation: The pattern was rotated clockwise 270 degrees.
		boolean b=true;	
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(or[i][j]!=tf[n-j-1][i]){
					b=false;
				}
			}
		}
		return b;
	}
	public static boolean c4(char[][] or, char[][] tf){
		//#4: Reflection: The pattern was reflected horizontally (turned into a mirror image of itself by reflecting around a vertical line in the middle of the image).
		boolean b=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(or[i][j]!=tf[i][n-j-1]){
						b=false;
				}
			}
		}
		return b;
	}
	public static boolean c51(char[][] or, char[][] tf){
		//#5: Combination: The pattern was reflected horizontally and then subjected to one of the rotations (#1-#3).
		boolean b=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(or[i][j]!=tf[n-j-1][n-i-1]){
					b=false;
				}
			}
		}
		return b;
	}
	public static boolean c52(char[][] or, char[][] tf){
		boolean b=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(or[i][j]!=tf[n-i-1][j]){
					b=false;
				}
			}
		}
		return b;
	}
	public static boolean c53(char[][] or, char[][] tf){
		boolean b=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(or[i][j]!=tf[j][i]){
					b=false;
				}
			}
		}
		return b;
	}
	public static boolean c6(char[][] or, char[][] tf){
		//#6: No Change: The original pattern was not changed.
		boolean b=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(or[i][j]!=tf[i][j]){
					b=false;
				}
			}
		}
		return b;
	}
}
