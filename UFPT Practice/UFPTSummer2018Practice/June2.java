import java.util.Scanner;

public class June2 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int q=kb.nextInt(); //range
		int n=kb.nextInt(); //num of points
		int d=kb.nextInt(); //sum
		int f1[]=new int[n];
		String s=kb.next();
		for(int i=0;i<q;i++){
			f1[n]=Integer.parseInt(s.substring(i,i+1));
		}
		int f2[]=new int[n];
		s=kb.next();
		for(int i=0;i<n;i++){
			f2[i]=Integer.parseInt(s.substring(i,i+1));
		}
		boolean same[]=new boolean[n];
		for(int i=0;i<n;i++){
			if(f1[i]==f2[i]){
				same[n]=true;
			}
		}
		
	}

}
