package arrayconcepts;

public class Buffer {
	public static void main(String[] args) {
		String st1="Kavin";
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(st1);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" kumar is a programmer");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		/*sb.reverse();
		System.out.println(sb);*/
		sb.delete(6,11);
		System.out.println(sb);
		sb.replace(6,9,"was");
		System.out.println(sb);
		sb.insert(6,"has ");
		System.out.println(sb);
		
	}

}
