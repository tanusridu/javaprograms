package conditionalstatement;
import java.util.Scanner;

public class IfElseEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if((num%3==0)&&(num%5==0)){
			System.out.println("Fizz buzz");
		}
		else if(num%3==0){
			System.out.println("Fizz");
		}
			else if(num%5==0){
				System.out.println("buzz");
				}
			else{
				System.out.println("invalid");
			}
		
		

	}

}
