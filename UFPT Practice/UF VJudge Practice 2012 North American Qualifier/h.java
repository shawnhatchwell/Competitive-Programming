import java.util.*;
import java.io.*;
public class h {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		int max=0;
		while(kb.hasNextLine()){
			String s=kb.nextLine();
			a.add(s.length());
			max=Math.max(max, a.get(a.size()-1));
		}
		int count=0;
		for(int i=0;i<a.size()-1;i++){
			count+=(a.get(i)-max)*(a.get(i)-max);
		}
		System.out.println(count);

	}

}
