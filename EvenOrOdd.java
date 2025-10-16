package methods;

public class EvenOrOdd {
    boolean even(int a){
    	if(a%2==0){
    		return true;
    	}return false;
    	
    }
	public static void main(String[] args) {
        EvenOrOdd e=new EvenOrOdd();
        System.out.println(e.even(5)?"even":"odd");
        System.out.println(e.even(6)?"even":"odd");

	}

}
