package operators;

public class TernayOperator {

	public static void main(String[] args) {
		int mark=101;
		/*String res=(mark>49)? "Pass":"Fail";//86>49 condition true then it execute the true condition
		boolean op=(mark>49)? true:false;
		System.out.println(op);
		System.out.println(res);*/
		String op=(mark>=0&&mark<=100)?((mark>49)?"pass":"fail"):((mark<0)?"negative mark":"out of limit");
		System.out.println(op);
		
		

	}

}
