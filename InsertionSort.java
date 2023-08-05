import java.util.Arrays;

public class InsertionSort{

	public static void sort(int[] arr){
		for (int i=1;i<arr.length ;i++ ) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]){
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}//while
		}
		System.out.print(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = {8,3,6,2,1,5,8,-12,33,999,-31,1};
		sort(arr);
	}
}