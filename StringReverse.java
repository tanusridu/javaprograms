package arrayconcepts;

public class StringReverse {
	public static void main(String[] args) {
		String s="Tanusri uvaraj";
		String res="";
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			res=res+ch;
		}
		System.out.println(res);

	}

}
