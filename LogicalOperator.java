package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		int num=10;
		/*System.out.println(num++);//first print 5 and then increment to 6
		System.out.println(++num);//first increment 6 then print 7
		*/
		
		System.out.println(num++>10 && ++num<10);
		System.out.println(num);
	}

}
