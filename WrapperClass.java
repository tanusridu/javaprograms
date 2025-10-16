package collectionsconcepts;

public class WrapperClass {
	public static void main(String[] args) {
		//auto boxing
		int num=10225;
		Integer nu=Integer.valueOf(num);
		/*Integer n=num;*/
		//unboxing
		Integer no=2548;
		int op=no.intValue();
		//int o=no;
		
		//non primitive to non primitive
		//Integer to String
		Integer no1=568412;
		String st1=String.valueOf(no1);
		
		//String to Integer
		String st="52436";
		Integer res=Integer.parseInt(st);

		
	}

}
