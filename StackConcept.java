package collectionsconcepts;
import java.util.Stack;
public class StackConcept {
		public static void main(String[] args) {
		       Scanner st=new Scanner(System.in);
		       Stack<Integer> s=new Stack<Integer>();
		       s.push(12);
		       s.push(13);
		       s.push(22);
		       s.push(122);
		       s.push(120);
		       System.out.println("After push:"+s);
		       System.out.println("after pop:"+s.pop());//display last element and remove
		       System.out.println("After peek:"+s.peek());//top element
		       System.out.println(s.size());//print size
		       System.out.println(s.isEmpty());//to check stack is empty or not
		       s.add(125);
		       System.out.println(s);
		       s.clear();//clear all the element
		       System.out.println(s);
		       System.out.println("capacity :"+s.capacity());//default capacity is 10 ,if 11 10*2
		       
		       
		       
		       
		       
	}

}
