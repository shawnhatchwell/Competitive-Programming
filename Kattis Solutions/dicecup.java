import java.util.Scanner;

public class dicecup {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int m=kb.nextInt();
		int n=kb.nextInt();
		int a[]=new int[m+n+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				a[i+j]++;
			}
		}
		int max=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==max){
				System.out.println(i);
			}
		}

	}

}
