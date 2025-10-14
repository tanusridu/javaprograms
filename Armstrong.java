package loops;

public class Armstrong {

	public static void main(String[] args) {
		/*int num=153;
		int temp=num;
		int len=0;
		while(num!=0){
			len++;
			num/=10;
		}
		num=temp;
		int sum=0;
		while(num!=0){
			int last=num%10;
			int pow=1;
			for(int i=1;i<=len;i++){
				pow=pow*last;
			}
			sum=sum+pow;
			num/=10;
		}
		if(sum==temp){
			System.out.println("Armstrong");
		}
		else{
			System.out.println("not");
		}*/
		
		for(int n=10;n<=10000;n++){
			int temp=n;
			int len=0;
			while(n!=0){
				len++;
				n/=10;
			}
			n=temp;
			int sum=0;
			while(n!=0){
				int last=n%10;
				int pow=1;
				for(int i=1;i<=len;i++){
					pow=pow*last;
				}
				sum=sum+pow;
				n/=10;
			}
			if(sum==temp){
			System.out.println(sum);
			}
			n=temp;
			
			
			
		}

	}

}
