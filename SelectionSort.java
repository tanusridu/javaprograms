package arrayconcepts;
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
	public static void main(String[] args) {
		int arr[]={25,99,15,46,73};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
		

	}

}
