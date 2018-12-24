import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		for(int i=0;i<t;i++){
			int n=kb.nextInt();
			int k=kb.nextInt();
			System.out.println(n+k-1);
		}

	}

}
