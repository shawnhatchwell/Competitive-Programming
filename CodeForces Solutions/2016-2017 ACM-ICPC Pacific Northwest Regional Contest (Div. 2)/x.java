import java.util.*;
import java.io.*;
public class x {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a[][]=new int[3][2];
		a[0][0]=kb.nextInt();
		a[0][1]=kb.nextInt();
		a[1][0]=kb.nextInt();
		a[1][1]=kb.nextInt();
		a[2][0]=kb.nextInt();
		a[2][1]=kb.nextInt();
		boolean b=false;
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
					for(int l=0;l<2;l++){
						if(a[(0+i)%3][0+j]==a[(1+i)%3][0+k]+a[(2+i)%3][0+l]&&a[(1+i)%3][1-k]==a[(2+i)%3][1-l]&&a[(0+i)%3][1-j]+a[(1+i)%3][1-k]==a[(0+i)%3][0+j])
							b=true;
						if(a[(0+i)%3][0+j]==a[(1+i)%3][0+k]&&a[(0+i)%3][0+j]==a[(2+i)%3][0+l]&&a[(0+i)%3][1-j]+a[(1+i)%3][1-k]+a[(2+i)%3][1-l]==a[(0+i)%3][0+j])
							b=true;
					}
				}
			}
		}
		System.out.println(b?"YES":"NO");
		
	}

}
