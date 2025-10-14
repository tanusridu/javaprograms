package loops;

public class PrimeInRange {

	public static void main(String[] args) {
		/*int n=5;
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
			if(count==2){
				System.out.println(n);
			}*/
		
		for(int n=10;n<=20;n++){
			int count=0;
			for(int i=1;i<=n;i++){
				if(n%i==0){
					count++;
				}
			}
			if(count==2){
				System.out.println(n);
			}
			}
		}

	}


