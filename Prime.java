package methods;
import java.util.Scanner;
public class Prime {
	/*Scanner s=new Scanner(System.in);*/
	boolean num(int a){
		/*int count=0;*/
		for(int i=2;i<=a/2;i++){
			if(a%i==0){
				/*count++;*/
				return false;
		/*}if(count==2){
			return true;*/
			}
		/*return false;*/
		}	return true;
	}
	

	public static void main(String[] args) {
	
		Prime p=new Prime();
		System.out.println(p.num(6)?"prime":"not prime");
		System.out.println(p.num(2)?"prime":"not a prime");
		

	}

}
