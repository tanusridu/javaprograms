package conditionalstatement;

public class IfElseIf {
	public static void main(String[] args) {
		int mark=10;
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

}
