import java.io.*;
import java.util.*;
public class calendar {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		while(!s.equals("")){
			StringTokenizer tk=new StringTokenizer(s);
			
			
			String date=tk.nextToken();
			String parse="";
			//48-57
			for(int i=0;i<10;i++){
				if((int)date.charAt(i)<48||(int)date.charAt(i)>57){
					parse=date.substring(i,i+1);
					i=10;
				}
			}
			StringTokenizer q=new StringTokenizer(date,parse);
			String a[]=new String[3];
			for(int i=0;i<3;i++){
				a[i]=q.nextToken();
				//System.out.println(a[i]);
			}
			date=tk.nextToken();
			q=new StringTokenizer(date,parse);
			String b[]=new String[3];
			for(int i=0;i<3;i++){
				b[i]=q.nextToken();
				//System.out.println(b[i]);
			}
			
			date=tk.nextToken();
			for(int i=0;i<10;i++){
				if((int)date.charAt(i)!='d'&&(int)date.charAt(i)!='m'&&(int)date.charAt(i)!='y'){
					parse=date.substring(i,i+1);
					i=10;
				}
			}
			q=new StringTokenizer(date,parse);
			String c[]=new String[3];
			for(int i=0;i<3;i++){
				c[i]=q.nextToken();
				//System.out.println(c[i]);
			}
			
			String d[]=new String[3];
			boolean used[]=new boolean[3];
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(b[i].equals(c[j])&&!used[j]){
						used[j]=true;
						d[j]=a[i];
						j=3;
					}
				}
			}
			System.out.println(d[0]+parse+d[1]+parse+d[2]);
			
			
			
			
			s=kb.nextLine();
			
		}
		System.out.println();

	}

}
