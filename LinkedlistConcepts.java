package collectionsconcepts;
import java.util.LinkedList;
public class LinkedlistConcepts {
	public static void main(String[] args) {
		LinkedList<Integer> ll =new LinkedList<Integer>();
		ll.add(1);ll.add(2);ll.add(3);ll.add(4);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(0));
		ll.set(2,12);
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		ll.addFirst(0);
		ll.addLast(5);
		System.out.println(ll);
		
		
		ll.add(3,4);
		System.out.println(ll);
		ll.remove();
		System.out.println("After remove: "+ll);
		ll.removeLast();
		System.out.println("After removeLast:"+ll);
		ll.remove(2);
		System.out.println("After remove index:"+ll);
		ll.removeFirstOccurrence(3);
		System.out.println("After removal of first ocurence:"+ll);
		ll.removeLastOccurrence(3);
		System.out.println("After removal of last occurence"+ll);
		System.out.println("Size:"+ll.size());
		System.out.println("is empty:"+ll.isEmpty());
		System.out.println("indexof:"+ll.indexOf(2));
		ll.clear();
		System.out.println("clear:"+ll);
		
		

	}

}
