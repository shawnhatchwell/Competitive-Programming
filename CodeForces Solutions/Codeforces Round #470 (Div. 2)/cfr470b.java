import java.util.*;
import java.io.*;
public class cfr470b {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int x2=kb.nextInt();
		
		boolean nps[]=new boolean[1000001];
		nps[0]=true;
		nps[1]=true;
		int pr[]=new int[78498];
		int count=0;
		for(int i=2;i<nps.length;i++){
			if(!nps[i]){
				pr[count]=i;
				count++;
				for(int j=2*i;j<nps.length;j+=i){
					nps[j]=true;
					
				}
			}
		}
		
		int p2=0;
		for(int i=2;i<x2;i++){
			if(x2%i==0&&!nps[x2/i]){
				p2=x2/i;
				i=x2;
			}
				
		}
		//x0=x1-p1+1
		int p1=2;
		int p=0;
		for(int i=0;i<pr.length;i++){
			if(pr[i]<p2) p1=pr[i];
		}
		int x1=x2-x2%p1;
		int x0=x1-p1+1;
		System.out.println(x2);
		System.out.println(p2);
		System.out.println(x1);
		System.out.println(p1);
		System.out.println(x0);
	}

}
