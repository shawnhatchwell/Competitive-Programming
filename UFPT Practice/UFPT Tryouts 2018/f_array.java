import java.io.*;
import java.util.*;
public class f_array {

	public static void main(String[] args) throws IOException{
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine());
		StringTokenizer tk=new StringTokenizer(f.readLine());
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(tk.nextToken());
		}
		long sum1=0;
		long sum3=0;
		long sum=0;
		int left=-1;
		int right=n;
		while(left<right){	
			//System.out.println(sum1+" "+sum3);
			if(sum1==sum3){
				sum=sum1;
				if(left+1<right+1){
					left++;
					sum1+=a[left];
					right--;
					sum3+=a[right];
				}
				else{
					break;
				}
			}
			else if(sum1<sum3){
				left++;
				sum1+=a[left];
					
			}
			else{
				right--;
				sum3+=a[right];
							
			}
			
		}
		System.out.println(sum);
	}
	

}
