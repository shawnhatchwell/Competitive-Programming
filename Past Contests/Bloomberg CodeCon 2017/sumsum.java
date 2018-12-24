import java.util.*;
public class sumsum {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int q=(int)Math.sqrt(n)+1;
		long sum=0;
		for(int i=1;i<=q;i++){
			for(int j=i;j<=q;j++){
				for(int k=j;k<=q;k++){
					//System.out.println(i+" "+j+" "+k);
					if(i*i+j*j+k*k==n){
						sum+=i+j+k;
					}
					else if(i*i+j*j+k*k>n){
						k=q;
					}
				}
			}
		}
		System.out.println(sum);

	}

}
