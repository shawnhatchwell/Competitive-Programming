import java.io.*;
import java.util.*;
public class e_treasure {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		String s1=f.readLine();
		String s2=f.readLine();
		String s3=f.readLine();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<s1.length();i++){
			if(!hm.containsKey(s1.charAt(i))){
				hm.put(s1.charAt(i),1);
			}
			else{
				hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
			}
		}
		int max1=0;
		for(Integer a:hm.values()){
			if(a+n>s1.length()){
				max1=Math.max(s1.length()-((a+n-s1.length())%2),max1);
			}
			else{
				max1=Math.max(a+n,max1);
			}
		}
		if(n>s1.length()){
			max1=Math.max(s1.length()-((n-s1.length())%2), max1);
		}
		else{
			max1=Math.max(n, max1);
		}
		
		
		hm=new HashMap<Character,Integer>();
		for(int i=0;i<s2.length();i++){
			if(!hm.containsKey(s2.charAt(i))){
				hm.put(s2.charAt(i),1);
			}
			else{
				hm.put(s2.charAt(i),hm.get(s2.charAt(i))+1);
				
			}
		}
		int max2=0;
		for(Integer a:hm.values()){
			if(a+n>s2.length()){
				max2=Math.max(s2.length()-((a+n-s2.length())%2),max1);
			}
			else{
				max2=Math.max(a+n,max2);
			}
		}
		if(n>s2.length()){
			max2=Math.max(s2.length()-((n-s2.length())%2), max2);
		}
		else{
			max2=Math.max(n, max2);
		}
		
		hm=new HashMap<Character,Integer>();
		for(int i=0;i<s3.length();i++){
			if(!hm.containsKey(s3.charAt(i))){
				hm.put(s3.charAt(i),1);
			}
			else{
				hm.put(s3.charAt(i),hm.get(s3.charAt(i))+1);
				
			}
		}
		int max3=0;
		for(Integer a:hm.values()){
			if(a+n>s3.length()){
				max3=Math.max(s3.length()-((a+n-s3.length())%2),max1);
			}
			else{
				max3=Math.max(a+n,max3);
			}
		}
		if(n>s3.length()){
			max3=Math.max(s3.length()-((n-s3.length())%2), max2);
		}
		else{
			max3=Math.max(n, max3);
		}
		
		//System.out.println(max1+" "+max2+" "+max3);
		if(max1>max2&&max1>max3){
			System.out.println("Kuro");
		}
		else if(max2>max1&&max2>max3){
			System.out.println("Shiro");
		}
		else if(max3>max2&&max3>max1){
			System.out.println("Katie");
		}
		else{
			System.out.println("Draw");
		}
		
		
		
		
	}

}
