import java.util.Scanner;


public class pot {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int sum=0;
		for(int i=0;i<n;i++){
			int a=kb.nextInt();int b=a/10;
			int c=a%10;
			sum+=Math.pow(b, c);
		}
		System.out.println(sum);

	}

}
