import java.util.*;
public class j {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=Integer.parseInt(kb.nextLine());
		for(int kk=0;kk<n;kk++){
			ArrayDeque<Integer> a=new ArrayDeque<Integer>();
			StringTokenizer st=new StringTokenizer(kb.nextLine());
			while(st.hasMoreTokens()){
				a.add(st.nextToken().length()+1);
			}
			int size=a.size();
			int arr[]=new int[size];
			long sum=0;
			for(int i=0;i<size;i++){
				arr[i]=a.removeFirst();
				sum+=arr[i];
			}
			boolean b=false;
			for(int i=2;i<=size;i++){
				if(sum%i==0){
					
					
					int sum2=0;
					boolean b2=true;
					for(int j=0;j<size;j++){
						sum2+=arr[j];
						if(sum2==sum/i){
							sum2=0;
						}
						else if(sum2>sum/i){
							b2=false;
							j=size;
						}
					}
					if(b2){
						b=true;
						i=size+1;
					}
				}
			}
			System.out.println(b?"YES":"NO");
		}
		

	}

}
