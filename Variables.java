package basic;

public class Variables {
    int insvar=20;
	void meth(){
		int locVar=50;
		System.out.println(locVar);
		System.out.println(insvar);
	}
	void disp(){
		//  System.out.println(locVar);
		System.out.println(insvar);
	}
	
	public static void main(String[] args) {
		   Variables obj;
		   obj=new Variables();
		   System.out.println(obj);
		   Variables obj1=new Variables();
		   System.out.println(obj1);
		   obj.meth();
		   obj.disp();
	}
}

