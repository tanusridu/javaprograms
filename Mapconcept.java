package collectionsconcepts;
import java.util.Map;
import java.util.HAshMap;
public class Mapconcept {

	public static void main(String[] args) {
		Map<Integer,String>=new HashMap<>();
		m.put(0,"a");
		m.put(1,"b");
		m.put(2,"c");
		m.put(3,"d");
		m.put(4,"e");
		System.out.println(m);
		System.out.println(m.get(3));//key value 3
        System.out.println(m.size());
        System.out.println(m.containsKey(1));
        System.out.println(m.containsValue("c"));
        System.out.println(m);
	}

}
