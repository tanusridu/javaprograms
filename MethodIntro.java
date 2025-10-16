package methods;
import java.util.Scanner;
public class MethodIntro {
	//method declaration or definition part 
	void add(){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		MethodIntro ob1=new MethodIntro();
		System.out.println("method calling 1");
		ob1.add();//method calling
		System.out.println("method return 1");
		System.out.println("method calling 2");
		ob1.add();
		System.out.println("method return 2");
		System.out.println("method calling 3");
		ob1.add();
		System.out.println("method return 3");
		
	}

}
