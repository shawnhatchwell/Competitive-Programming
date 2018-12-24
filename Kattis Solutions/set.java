import java.util.*;
import java.io.*;

public class set {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		
		String s=f.readLine().trim()+" "+f.readLine().trim()+" "+f.readLine().trim()+" "+f.readLine().trim();
		StringTokenizer tk=new StringTokenizer(s);
		String[] a=new String[12];
		for(int i=0;i<12;i++){
			a[i]=tk.nextToken();
		}
		boolean b=false;
		for(int i=0;i<12;i++){
			for(int j=i+1;j<12;j++){
				for(int k=j+1;k<12;k++){
					if((a[i].charAt(0)==a[j].charAt(0)&&a[j].charAt(0)==a[k].charAt(0))||(a[i].charAt(0)!=a[j].charAt(0)&&a[j].charAt(0)!=a[k].charAt(0)&&a[k].charAt(0)!=a[i].charAt(0))){
						if((a[i].charAt(1)==a[j].charAt(1)&&a[j].charAt(1)==a[k].charAt(1))||(a[i].charAt(1)!=a[j].charAt(1)&&a[j].charAt(1)!=a[k].charAt(1)&&a[k].charAt(1)!=a[i].charAt(1))){
							if((a[i].charAt(2)==a[j].charAt(2)&&a[j].charAt(2)==a[k].charAt(2))||(a[i].charAt(2)!=a[j].charAt(2)&&a[j].charAt(2)!=a[k].charAt(2)&&a[k].charAt(2)!=a[i].charAt(2))){
								if((a[i].charAt(3)==a[j].charAt(3)&&a[j].charAt(3)==a[k].charAt(3))||(a[i].charAt(3)!=a[j].charAt(3)&&a[j].charAt(3)!=a[k].charAt(3)&&a[k].charAt(3)!=a[i].charAt(3))){
									System.out.println((i+1)+" "+(j+1)+" "+(k+1));
									b=true;
								}
							}
						}
					}
				}
			}
		}
		if(!b){
			System.out.println("no sets");
		}
	}
	
}