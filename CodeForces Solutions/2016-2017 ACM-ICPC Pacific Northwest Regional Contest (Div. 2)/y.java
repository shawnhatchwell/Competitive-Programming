import java.util.*;
import java.io.*;

public class y {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=kb.nextInt();
		}
		
		int dpu[]=new int[n];
		int dpd[]=new int[n];
		boolean goUp[]=new boolean[n];
		boolean goDown[]=new boolean[n];
		goUp[0]=true;
		goDown[0]=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				if(goUp[j]&&a[i]<a[j]){
					dpu[i]=Math.max(dpd[j]+1, dpu[i]);
					goDown[i]=true;
				}
				if(goDown[j]&&a[i]>a[j]){
					dpd[i]=Math.max(dpu[j]+1, dpd[i]);
					goUp[i]=true;
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++){
			max=Math.max(dpu[i], max);
			max=Math.max(dpd[i], max);
		}
		System.out.println(max+1);
		

	}

}
