package loops;

public class StongNumber {

	public static void main(String[] args) {
		int num=145;
		int sum=0;
		int temp=num;
		while(temp!=0){
			int last=temp%10;
			int fact=1;
			for(int i=1;1<=last;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			temp/=10;
		}
		if(num==sum){
			System.out.println("strong number");
		}
		else{
			System.out.println("not");
		}

	}

}
