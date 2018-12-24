import java.util.Scanner;

public class cold {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String l=kb.nextLine();
		String s=kb.nextLine();
		int count=0;
		while(s.contains("-")){
			count++;
			s=s.substring(s.indexOf("-")+1);
		}
		System.out.println(count);

	}

}