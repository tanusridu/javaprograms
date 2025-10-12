package basic;
import java.util.Scanner;
public class UserInput {
     

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
         int num=sc.nextInt();
        System.out.println("Value "+num);
        char ch=sc.next().charAt(0);
        System.out.println(ch);
        float fl=sc.nextFloat();
        System.out.println("Value "+fl);
		sc.nextLine();
		String str=sc.nextLine();
		System.out.println("val"+str);
		
	}

}
