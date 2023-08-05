import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {9,3,2,7,1,8,6};
		sort(arr,0,arr.length-1);
		//System.out.println(Arrays.toString(arr));
	}

	private static<T extends Comparable<T>> void sort(T[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
			int pivot = partition(arr,low,high);
			System.out.println(Arrays.toString(arr));
			sort(arr,low,pivot-1);
			sort(arr,pivot+1,high);
		}
	}

	private static<T extends Comparable<T>> int partition(T[] arr, int low, int high) {
		// TODO Auto-generated method stub
		T pivot = arr[high];
		int i  = low-1;
		for(int j=low;j<high;j++) {
			if(arr[j].compareTo(pivot)<0) {
				i++;
				swap(arr,i,j);
			}
		}
		i++;
		swap(arr,i,high);
		return i;
	}

	private static<T extends Comparable<T>> void swap(T[] arr, int i, int j) {
		// TODO Auto-generated method stub
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
