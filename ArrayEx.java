package arrayconcepts;
import java.util.Scanner;
public class ArrayEx {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int mark[]=new int[6];
		int total=0;
		float average=0;
		for(int i=0;i<mark.length;i++){
			mark[i]=s.nextInt();
			total=total+mark[i];
			average=total/(mark.length);
		}
		System.out.println("total is:"+total);
		System.out.println("average is:"+average);
		
		
		

	}

}
