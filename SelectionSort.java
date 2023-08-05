import java.util.Arrays;

public class SelectionSort{

	// public static<T extends Comparable<T>> void sortIterative(T[] arr,int s,int e){
	// 	int minIndex;
	// 	for (int i=s;i<e ;i++ ) {
	// 		minIndex=i;
	// 		for (int j=i+1;j<=e ; j++) {
	// 			if(arr[j].compareTo(arr[minIndex])<0){
	// 				minIndex=j;
	// 			}
	// 		}
	// 		T temp=arr[minIndex];
	// 		arr[minIndex]=arr[i];
	// 		arr[i]=temp;
	// 	}
	// 	System.out.print(Arrays.toString(arr));
	// }

	public static<T extends Comparable<T>> void sortRecursive(T[] arr,int s,int e){
		if(s<e) {
			int minIndex=getMinIndex(arr,s,e);
			T temp=arr[s];
			arr[s]=arr[minIndex];
			arr[minIndex]=temp;
			sortRecursive(arr,s+1,e);
			sortRecursive(arr,s,e-1);
		}
	}

	private static<T extends Comparable<T>> int getMinIndex(T[] arr,int s,int e){
		int minIndex=s;
		if(s<e){
			if (arr[s+1].compareTo(arr[minIndex])<0) {
				minIndex = s+1;
			}
			getMinIndex(arr,s+1,e);
		}
		return minIndex;
	}

	public static void main(String[] args) {
		Integer[] arr = {7,3,6,4,2,6,2,1};
		//sortIterative(arr,2,6);
		sortRecursive(arr,0,7);
		System.out.print(Arrays.toString(arr));
	}
}