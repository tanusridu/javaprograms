package collectionsconcepts;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class QueueConcept {

	public static void main(String[] args) {
		 Scanner st=new Scanner(System.in);
	       Queue<String> q=new LinkedList<>();
	       q.add("tanu");
	       q.add("varana");
	       q.add("yazhini");
	       q.add("tharshi");
	       q.add("priya");
	       System.err.println(q);
	       System.out.println("poll element:"+q.poll());
	        System.out.println(q);
	         System.err.println("peek element:"+q.peek());
	          System.out.println("size:"+q.size());
	           System.out.println("empty check:"+q.isEmpty());
	           q.clear();
	            System.out.println(q);
	       
	       
	       
	       

	}

}
