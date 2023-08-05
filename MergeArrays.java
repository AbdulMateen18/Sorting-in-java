import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,5,7,9,11,13,0,0,0,0,0,0};
		int[] arr2 = {0,2,4,6,8,12};

		merge(arr1,7,arr2,6);
		
		// int[] temp = new int[arr1.length+arr2.length];
		
		// int index1 = 0;
		// int index2 = 0;
		// int i=0;
		// while(index1<arr1.length && index2<arr2.length) {
		// 	if(arr1[index1]<arr2[index2]) {
		// 		temp[i] = arr1[index1];
		// 		index1++;
		// 	}
		// 	else {
		// 		temp[i] = arr2[index2];
		// 		index2++;
		// 	}
		// 	i++;
		// }//while
		
		// /*upr waly code tak sir aik sub-array completely copy hogi
		// remaining elements copy krny k lia nichy wala code h.*/
		
		// while(index1<arr1.length) {
		// 	temp[i] = arr1[index1];
		// 	index1++;
		// 	i++;
		// }
		
		// while(index2<arr2.length) {
		// 	temp[i] = arr2[index2];
		// 	index2++;
		// 	i++;
		// }
		
		
	}

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] temp = new int[m+n];
		
		int index1 = 0;
		int index2 = 0;
		int i=0;
		while(index1<m && index2<n) {
			if(nums1[index1]<nums2[index2]) {
				temp[i] = nums1[index1];
				index1++;
			}
			else {
				temp[i] = nums2[index2];
				index2++;
			}
			i++;
		}//while
		
		/*upr waly code tak sirf aik sub-array completely copy hogi
		remaining elements copy krny k lia nichy wala code h.*/
		
		while(index1<m) {
			temp[i] = nums1[index1];
			index1++;
			i++;
		}
		
		while(index2<n) {
			temp[i] = nums2[index2];
			index2++;
			i++;
		}

		System.out.println(Arrays.toString(temp));
    }
}