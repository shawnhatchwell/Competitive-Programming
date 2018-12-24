import java.util.Scanner;

public class i {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		for(int i=0;i<t;i++){
			int n=kb.nextInt();
			int m=kb.nextInt();
			if(n%2==0&&m%2==0){
				System.out.println("abdullah");
			}
			else{
				System.out.println("hasan");
			}
		}

	}

}
