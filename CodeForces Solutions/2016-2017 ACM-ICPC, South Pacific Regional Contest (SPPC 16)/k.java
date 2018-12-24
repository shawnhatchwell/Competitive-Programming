import java.util.*;
import java.io.*;
public class k {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		String kang="KANGAROO";
		String kiwi="KIWIBIRD";
		int ki=0;
		int ka=0;
		for(int i=0;i<s.length();i++){
			if(kang.contains((""+s.charAt(i)).toUpperCase())){
				ka++;
			}
			if(kiwi.contains((""+s.charAt(i)).toUpperCase())){
				ki++;
			}
			
		}
		if(ka>ki){
			System.out.println("Kangaroos");
		}
		else if(ki>ka){
			System.out.println("Kiwis");
		}
		else{
			System.out.println("Feud continues");
		}
	}

}
