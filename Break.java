package loops;

public class Break {

	public static void main(String[] args) {
		/*int num=12;
		boolean flag=true;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(num+"is a prime");
		}
		else{
			System.out.println(num+"is not a prime");
		}*/
		
		//perfect number
         int num=6;
         int n=0;
         for(int i=1;i<=num/2;i++){
        	 if(num%i==0){
        		 System.out.println(i);
        		 n=n+i;
        		 }
        		 
        	 }
         System.out.println(n);
         if(n==num){
        	 System.out.println(num+ "is perfect");
         }
         else{
        	 System.out.println(num+ "is not perfect");
         }
        
         
         }
	}


