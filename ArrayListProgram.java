package collectionsconcepts;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));//to get index value of 2
		al.set(2, 10);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
		
		boolean isPrime(int num) {

			for(int i=2;i<=num/2;i++) {

				if(num%i==0) {

					return false;

				}

			}

			return true;

		}

		ArrayList<Integer> primeBwRange(int st,int ed) {

			ArrayList<Integer> al=new ArrayList<>();

			for(int i=st;i<=ed;i++) {

				if(isPrime(i)) {

					al.add(i);

				}

			}

			return al;

		}

		public static void main(String[] args) {

			ArrayListProgram sv=new ArrayListProgram();

			ArrayList<Integer> a=sv.primeBwRange(10, 20);

			System.out.println(a);

		}
		
 }

}
