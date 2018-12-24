import java.util.*;
import java.io.*;
public class a {
	public static void main(String args[]){
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		int aSideLength=1;
		int bSideLength=1;
		while(a>aSideLength*aSideLength){
			aSideLength+=2;
		}
		int aSquareNum=aSideLength*aSideLength;
		
		while(b>bSideLength*bSideLength){
			bSideLength+=2;
		}
		int bSquareNum=bSideLength*bSideLength;
		
		int aLevel=aSideLength/2;
		int bLevel=aSideLength/2;
		
		int ax=0;
		int ay=0;
		int bx=0;
		int by=0;
		
		int aTLCorn= aSquareNum-aSideLength+1;
		int aTRCorn= aTLCorn-aSideLength+1;
		int aBRCorn= aTRCorn-aSideLength+1;
		
		int bTLCorn= bSquareNum-bSideLength+1;
		int bTRCorn= bTLCorn-bSideLength+1;
		int bBRCorn= bTRCorn-bSideLength+1;
		
		
		System.out.println(bSideLength);
		System.out.println(bLevel);
		System.out.println(bSquareNum);
		System.out.println(bTLCorn);
		System.out.println(bTRCorn);
		System.out.println(bBRCorn);
		
		if(a>aTLCorn){
			ax=-aLevel;
			ay=aTLCorn+aLevel-a;
		}
		else if(a>aTRCorn){
			ay=aLevel;
			ax=aTRCorn+aLevel-a;
		}
		else if(a>aBRCorn){
			ax=aLevel;
			ay=a-(aBRCorn+aLevel);
		}
		else{
			ay=-aLevel;
			ax=a-(aBRCorn-aLevel);
		}
		
		if(b>bTLCorn){
			bx=-bLevel;
			by=bTLCorn+bLevel-b;
		}
		else if(b>bTRCorn){
			by=bLevel;
			bx=bTRCorn+bLevel-b;
		}
		else if(b>bBRCorn){
			bx=bLevel;
			by=b-(bBRCorn+bLevel);
		}
		else{
			by=-bLevel;
			bx=b-(bBRCorn-bLevel);
		}
		
		System.out.println(bx);
		System.out.println(by);
		
		System.out.println(Math.abs(ax-by)+Math.abs(ay-by));
	}
}
