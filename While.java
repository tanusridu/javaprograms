package loops;

public class While {
	public static void main(String[] args) {
		/*int num=2389;
		int sum=0;
		while(num!=0){
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		System.out.println(sum);*/
		
		//reverse
       int num=2389;
       int sum=0;
       int n=num;
       while(num!=0){
    	   int last=num%10;
    	   sum=sum*10+last;
    	   num=num/10;
    	   
    	   
       }
       /*System.out.println(sum);*/
       
       //palindrome
       if(n==num){
    	   System.out.println(n+"is palindrome");
       }
       else{
    	   System.out.println(n+"not palindrome");
       }
       
       
    	   
       }
      
	}


