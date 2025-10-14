package conditionalstatement;

public class NestedIf {

	
	public static void main(String[] args) {
		
		int mark=50;
		if(mark>=0&&mark<=100){
			if (mark<35){
				System.out.println("fail");
			}
			else if(mark>=35&&mark<50){
				System.out.println("average");
			}
			else if(mark>=50&&mark<85){
				System.out.println("good");
			}
			else{
				System.out.println("excellent");
			}
		
		}
		else{
			System.out.println("invalid");
		}

	}

}
