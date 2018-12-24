import java.util.*;
import java.io.*;
public class g {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		while(kb.hasNextLine()){
			if(kb.nextLine().toLowerCase().contains("problem")){
				System.out.println("yes");
			}
			else System.out.println("no");
		}

	}

}
