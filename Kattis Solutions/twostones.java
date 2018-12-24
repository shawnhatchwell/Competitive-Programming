import java.util.Scanner;

public class twostones {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		if(kb.nextInt()%2==1){
			System.out.println("Alice");
		}
		else{
			System.out.println("Bob");
		}

	}

}
