import java.util.Scanner;


public class base2palindrome {
	public static String r(String s){
		String r="";
		for(char c:s.toCharArray()){
			r=c+r;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		if(n==1){
			System.out.println(1);
		}
		else if(n==2){
			System.out.println(3);
		}
		else{
			String b=Integer.toBinaryString(n+1);
			n+=1;
			String q=b.substring(2,b.length());
			String p="1"+q+r(q)+"1";
			if(b.charAt(1)=='0')
				p=p.substring(0,p.length()/2)+p.substring(p.length()/2+1);
			System.out.println(Integer.parseInt(p, 2));
		}
		
		
	}

}
