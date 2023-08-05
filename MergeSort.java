import java.util.Arrays;

public class MergeSort{
	
	public static<T extends Comparable<T>> void sort(T[] arr,int first,int last) {
		T[] temp = (T[]) new Comparable[arr.length];
		mergeSort(arr,temp,first,last);
	}

	private static<T extends Comparable<T>> void mergeSort(T[] arr,T[] temp,int first,int last){
		if(first<last){
 			int mid = (first+last)/2;
			mergeSort(arr,temp,first,mid);
			mergeSort(arr,temp,mid+1,last);
			merge(arr,temp,first,mid,last);
		}
	}

	private static<T extends Comparable<T>> void merge(T[] arr,T[] temp,int s,int mid,int e){
		int beginHalf1 = s; 
		int endHalf1 = mid;
		int beginHalf2 = mid+1;
		int endHalf2 = e;
		int index = beginHalf1;
		while((beginHalf1<=endHalf1) && (beginHalf2<=endHalf2)){
			if (arr[beginHalf1].compareTo(arr[beginHalf2])<0) {
				temp[index]=arr[beginHalf1];
				beginHalf1++;
			}
			else{
				temp[index]=arr[beginHalf2];
				beginHalf2++;
			}
			index++;
		}//while

		 while(beginHalf1<=endHalf1){
		 	temp[index] = arr[beginHalf1];
		 	beginHalf1++;
		 	index++;
		 }

		 while(beginHalf2<=endHalf2){
		 	temp[index] = arr[beginHalf2];
		 	beginHalf2++;
		 	index++;
		 }

		for (index=s;index<=e ;index++ ) {
			arr[index]=temp[index];
		}
	}

	public static<T> void main(String[] args) {
		//Integer[] arr = {5,2,8,1,9,0,4,3,7,6};
		Integer[] arr1 = {5,2,8,1,9,0,4,3};
		sort(arr1,0,arr1.length-1);

		System.out.print(Arrays.toString(arr1));

	}
}