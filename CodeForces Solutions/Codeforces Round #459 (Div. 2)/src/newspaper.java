import java.util.Scanner;

public class newspaper {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		for(int kk=0;kk<t;kk++){
			int n=kb.nextInt();
			int s=kb.nextInt();
			int l=kb.nextInt();
			int w=kb.nextInt();
			if(w>n*s) System.out.println(-1);
			else System.out.println((n*(s-l)-(w-n*l))/(s-l));
		}
	}

}
