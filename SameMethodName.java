package methods;

public class SameMethodName {
	void sum(int num,int num1){
		System.out.println(num+num1);
	}
	void sum(int num,float num1){
		System.out.println(num+num1);
	}
	public static void main(String[] args) {
		SameMethodName s=new SameMethodName();
		s.sum(1, 2);
		s.sum(1,2.5f);

	}

}
