import java.util.*;
import java.io.*;
public class j {
	static int a[];
	static int c=0;
	static int n;
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		for(int kk=0;kk<t;kk++){
			n=kb.nextInt();
			int m=kb.nextInt();
			a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=kb.nextInt();
			}
			int s[]=new int[m];
			int f[]=new int[m];
			for(int i=0;i<m;i++){
				s[i]=kb.nextInt()-1;
				f[i]=kb.nextInt()-1;
			}
			ArrayList<HashSet<Integer>> dep1=new ArrayList<HashSet<Integer>>();
			ArrayList<HashSet<Integer>> dep2=new ArrayList<HashSet<Integer>>();
			for(int i=0;i<n;i++){
				dep1.add(new HashSet<Integer>());
				dep2.add(new HashSet<Integer>());
			}
			for(int i=0;i<m;i++){
				dep1.get(f[i]).add(s[i]);
				dep2.get(f[i]).add(s[i]);
			}
			boolean used[]=new boolean[n];
			lab1(dep1, used);
			int c1=c;
			c=0;
			used=new boolean[n];
			lab2(dep2, used);
			System.out.println(Math.min(c, c1));
		}

	}
	private static void lab1(ArrayList<HashSet<Integer>> dep, boolean[] used) {
		boolean done=true;
		for(int i=0;i<n;i++){
			if(!used[i]&&a[i]==1&&dep.get(i).size()==0){
				done=false;
				used[i]=true;
				for(int j=0;j<n;j++){
					if(dep.get(j).contains(i)){
						dep.get(j).remove(i);
					}
				}
			}
		}
		if(allUsed(used)){
			return;
		}
		else if(done){
			c++;
			lab2(dep,used);
		}
		else{
			lab1(dep,used);
		}
		
	}
	private static void lab2(ArrayList<HashSet<Integer>> dep, boolean[] used) {
		boolean done=true;
		for(int i=0;i<n;i++){
			if(!used[i]&&a[i]==2&&dep.get(i).size()==0){
				done=false;
				used[i]=true;
				for(int j=0;j<n;j++){
					if(dep.get(j).contains(i)){
						dep.get(j).remove(i);
					}
				}
			}
		}
		if(allUsed(used)){
			return;
		}
		else if(done){
			c++;
			lab1(dep,used);
		}
		else{
			lab2(dep,used);
		}
		
	}
	private static boolean allUsed(boolean[] used) {
		boolean b=true;
		for(int i=0;i<used.length;i++){
			if(!used[i]){
				b=false;
			}
		}
		return b;
	}

}
