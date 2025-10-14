package loops;

public class ForLoop {
	public static void main(String[] args) {
		/*for(int i=1;i<=10;i++){
			System.out.println(i +"*"+2+"=" +i*2);
		}*/
		
		//factorial
		/*int num=5;
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println(fact);*/
		
		//factors
		/*int n=10;
		int count=0;
		for(int i=1;i<=10;i++){
			if(n%i==0){
				System.out.println(i);
			    count++;}
			}
		System.out.println("count is "+count);*/
		
		//prime numbers
		int n=12;
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
				System.out.println(i);
			}
		}
			if(count==2){
				System.out.println("prime");
			}
			else{
				System.out.println("not prime");
			}
			
		}
		
		
	}


