import java.util.*;
import java.io.*;
public class b {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int m=Integer.parseInt(kb.next());
		String s[]=new String[m];
		int a[][]=new int[m][4];
		for(int i=0;i<m;i++){
			s[i]=kb.next();
			if(s[i].equals("rectangle")){
				for(int j=0;j<4;j++){
					a[i][j]=Integer.parseInt(kb.next());
				}
			}
			else{
				for(int j=0;j<3;j++){
					a[i][j]=Integer.parseInt(kb.next());
				}
			}
		}
		int n=Integer.parseInt(kb.next());
		for(int kk=0;kk<n;kk++){
			int x=Integer.parseInt(kb.next());
			int y=Integer.parseInt(kb.next());
			int count=0;
			for(int i=0;i<m;i++){
				if(s[i].equals("rectangle")){
					if(x>=a[i][0]&&x<=a[i][2]&&y>=a[i][1]&&y<=a[i][3]){
						count++;
					}
				}
				else{
					if((x-a[i][0])*(x-a[i][0])+(y-a[i][1])*(y-a[i][1])<=a[i][2]*a[i][2]){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
