package collectionsconcepts;
import java.util.HashSet();
import java.util.Set();
import java.util.Scanner();
public class SetConcept {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
	       Set<String> q=new HashSet<>();//LinkedHashSet
	       q.add("tanu");
	       q.add("yazhini");
	       q.add("varana");
	       q.add("tharshi");
	       q.add("yazhini");
	       System.out.println(q);
	       System.out.println("Size:"q.size());
	       q.remove("tharshi");
	       System.out.println(q);
	       
	       

	}

}
