package arrayconcepts;
import java.util.Scanner;
public class ArrayDeclaration {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String stage[]={"Kavin","Harish","kabilan","salman"};//array literals 
		/*stage[1]="Arjun";//changing array element
		System.out.println(stage);
		System.out.println(stage.length);//length of array
		System.out.println(stage[stage.length-1]);//to print last index
		system.out.println(stage)//address
		*/
		
		/*for(int i=0;i<stage.length;i++){
			System.out.println(stage[i]);}*///print elements of array
		
		int num[]=new int[5];
		boolean bool[]=new boolean[5];
		System.out.println(num[2]);
		num[0]=s.nextInt();
		for(int i=0;i<num.length;i++){
			num[i]=s.nextInt();
		}
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
			
		}
		
		
	}

}
