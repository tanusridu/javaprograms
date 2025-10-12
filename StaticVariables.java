package basic;

public class StaticVariables {
     int num=1; //instance
     static int num1=1;//static
     void disp(){
    	 num++;
    	 num1++;
    	 System.out.println("ins "+num);
    	 System.out.println("static"+num1);
     }

	
	public static void main(String[] args) {
		StaticVariables s1=new StaticVariables();
		StaticVariables s2=new StaticVariables();
	    StaticVariables s3=new StaticVariables();
	    s1.disp();
	    s2.disp();
	    s3.disp();
	}
}
		
		
		

	


