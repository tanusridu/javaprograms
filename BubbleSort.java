package arrayconcepts;
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
		int num[]={10,20,77,33,5,60};
		System.out.println(Arrays.toString(num));
		boolean swap=true;
		while(swap){
			swap=false;
		for(int i=0;i<num.length-1;i++){
			if(num[i]>num[i+1]){
			int temp=num[i];
			num[i]=num[i+1];
			num[i+1]=temp;
			swap=true;
			}	
		}
		System.out.println(Arrays.toString(num));
		}
	}
}
	


