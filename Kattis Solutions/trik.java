import java.util.Scanner;

public class trik {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		boolean x=true;
		boolean y=false;
		boolean z=false;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='A'&&(x||y)){
				x=!x;
				y=!y;
			}
			else if(s.charAt(i)=='B'&&(y||z)){
				y=!y;
				z=!z;
			}
			else if(s.charAt(i)=='C'&&(x||z)){
				x=!x;
				z=!z;
			}
		}
			if(x){
				System.out.println("1");
			}
			else if(y){
				System.out.println("2");
			}
			else{
				System.out.println("3");
			}

	}

}
