import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		for(int i=0;i<n;i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			int min=Math.min(a, Math.min(b, c));
			if(min==a){
				System.out.println("First");
			}
			else if(min==b){
				System.out.println("Second");
			}
			else{
				System.out.println("Third");
			}
		}

	}

}
