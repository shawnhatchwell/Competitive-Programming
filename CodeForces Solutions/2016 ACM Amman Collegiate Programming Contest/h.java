import java.util.*;
import java.io.*;
public class h {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int kk=Integer.parseInt(kb.next());
		for(int i=0;i<kk;i++){
			int c=Integer.parseInt(kb.next());
			int k=Integer.parseInt(kb.next())+1;
			String s=kb.next();
			int count=0;
			boolean b=false;
			if(!(k>c))
			for(int j=0;j<c;j++){
				if(s.charAt(j)=='0'){
					count++;
				}
				else{
					count=0;
				}
				if(count==k){
					j=c;
					System.out.println("yes");
					b=true;
				}
			}
			if(b==false) System.out.println("no");
		}

	}

}
