import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class words {
	public static void main(String[] args) throws IOException {
		
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(f.readLine().trim());
		
		for(int i=0;i<n;i++){
			System.out.println("Paragraph #"+(i+1)+":");
			int m=Integer.parseInt(f.readLine().trim());
			String s="";
			for(int j=0;j<m;j++){
				s+=f.readLine()+" ";
			}
			String[]p=s.trim().split("\\. ");
			int count=0;
			
			for(int j=0;j<p.length;j++){
				String[]t=p[j].split(" ");
				boolean b=true;
				for(int k=0;k<t.length-1;k++){
					if(t[k].toLowerCase().trim().compareTo(t[k+1].toLowerCase().trim())>=0)
						b=false;
					if(!b){
						k=t.length;
					}
				}
				if(b){
					count++;
					System.out.println("Sentence #"+(j+1)+": Brett Flows!");
				}
				else{
					System.out.println("Sentence #"+(j+1)+": It's Broken.");
				}
			}
			if(count==p.length){
				System.out.println("MAX FLOW");
			}
		}
	}
}
