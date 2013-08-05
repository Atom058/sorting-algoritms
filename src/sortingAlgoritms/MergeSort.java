package sortingAlgoritms;

import java.util.Arrays;

public class MergeSort {

	public static int[] sort(int[] list){
		if(list == null || list.length == 1){
			return list;
		} else{
			return mergeSort(list);
		}
	}
	
	private static int[] mergeSort(int[] list){
		if(list.length <= 1){
			return list;
		} else{
			//Split the array
			int[] la = mergeSort(Arrays.copyOfRange(list, 0, list.length/2));
			int[] ra = mergeSort(Arrays.copyOfRange(list, list.length/2, list.length));
			//Run through the list, replacing the values as we go
			//indexes of the two arrays
			int li = 0;
			int ri = 0;
			if(la.length == 0)
				li = -1;
			if(ra.length == 0)
				ri = -1;
			for(int i=0; i<list.length; i++){
				//If there are no more positions in left array, add right
				if(li == -1){
					list[i] = ra[ri];
					ri++;
				} else if(ri == -1){ //If there are no more positions in right array, add left
					list[i] = la[li];
					li ++;
				} else{ //Else, compare the two values from both arrays, choosing the smallest
					if(la[li] < ra[ri]){
						list[i] = la[li];
						li++;
					} else{
						list[i] = ra[ri];
						ri++;
					}
				}
				//If right or left indexes are larger than array size, set to -1
				if(ri >= ra.length)
					ri = -1;
				if(li >= la.length)
					li = -1;
			}
			return list;
		}
	}
	
}
