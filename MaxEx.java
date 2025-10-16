package arrayconcepts;
import java.util.Arrays;
public class MaxEx {

	public static void main(String[] args) {
		int num[]={10,20,30,40,50};
		//max and min
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++){
			if(num[i]>max){
				max=num[i];
			} 
			if(num[i]< min){
				min=num[i];
			}
		}
		System.out.println("maximum: "+max);
		System.out.println("minimum: "+min);
		
		//swapping
		/*int temp=num[0];
		num[0]=num[1];
		num[1]=temp;
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}System.out.println(Arrays.toString(num));*/
		

	}

}
