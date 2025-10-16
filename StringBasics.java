package arrayconcepts;

public class StringBasics {
	public static void main(String[] args) {
		String s="Tanusri";
		String sr="tanusri";
		String sc=new String("Tanusri du");
		System.out.println(s==sc);//s,sc stores different memory locations
		System.out.println(s.equals(sc));//check only characters in string not memory
		System.out.println(s.equalsIgnoreCase(sr));
		System.out.println(s.length());//length of string
		System.out.println(s.compareTo(sc));
		System.out.println(s.toUpperCase());
		System.out.println(sr.toLowerCase());
		System.out.println(s.charAt(2));//char at that index
		
		//changing upper to lower case
		String s1="TaNusRI";
		String res="";
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(ch>='a'&&ch<='z'){
				ch=(char)(ch-32);
			}
			else if(ch>='A'&&ch<='Z'){
				ch=(char)(ch+32);
			}
			res=res+ch;
			
		}System.out.println(res);
		
		//index of
		String str="programming is is";
		System.out.println(str.indexOf('o'));
		System.out.println(str.indexOf("is"));
		System.out.println(str.lastIndexOf('i'));
		System.out.println(str.indexOf("m",7));
		System.out.println(str.contains("is"));
		System.out.println(str.contains("are"));
		System.out.println(str.substring(6));
		System.out.println(str.substring(0,12));
		System.out.println(str.endsWith("is"));
		System.out.println(str.replace("is","are"));
		System.out.println(str.replaceFirst("is","are"));
		System.out.println(str.replaceAll("[aeiou]","*"));
		System.out.println(str.replaceAll("[aeiou]",""));
}
}
