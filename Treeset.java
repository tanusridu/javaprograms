package collectionsconcepts;
import java.util.TreeSet;//sort 
import java.util.Set;
public class Treeset {
	public static void main(String[] args) {
		Set<String> q=new TreeSet<>();//LinkedHashSet
	       q.add("tanu");
	       q.add("yazhini");
	       q.add("varana");
	       q.add("tharshi");
	       q.add("yazhini");
	       System.out.println(q);
	       System.out.println(q.size());
	       System.out.println(q.remove("tharshi"));
	       System.out.println(q);
	       System.out.println(q.contains("tanu"));
	       System.out.println(q.isEmpty());
	       q.clear();
	       System.out.println(q);
	       
	       
		
	}

}
