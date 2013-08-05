package sortingAlgoritms;

public class QuickSort {
	
	public static int[] sort(int[] list){
		if(list == null || list.length == 0){
			return list;
		} else{
			quickSort(list, 0, list.length-1);
			return list;
		}
	}
	
	private static void quickSort(int[] list, int start, int end){
		if(start < end){
			swap(list, (start+end)/2, end); //Move pivotPosition to last place
			int pivotPosition = end; //Set pivotposition to last place in sublist
			for(int i=start; i<=end; i++){
				if(i >= pivotPosition){
					//Break if at pivot or beyond
					break;
				}
				/*
				 * if the number in the list is greater than pivot
				 * 	*	Swap pivot one step "left"
				 * 	*	Swap list[i] to pivotPosition
				 * 	*	Set reduce pivotPosition one place
				 *  *	redo current i
				 */
				if(list[i] > list[pivotPosition]){
					//Swap the pivot one to the left, leaving a temp number in its last position.
					swap(list, pivotPosition, pivotPosition - 1);
					if(i < pivotPosition - 1){ //If the swap wasn't next to pivot
						//swap the larger number with the temp number
						swap(list, i, pivotPosition);
						//"Redo" the last round, as it is now populated with temp
						i--;
					}
					//Reduce the pivotPosition to reflect new position
					pivotPosition --;
				}
			}
			quickSort(list, start, pivotPosition-1);
			quickSort(list, pivotPosition + 1, end);
		}
	}
	
	private static void swap(int[] list, int s1, int s2){
		int temp = list[s1];
		list[s1] = list[s2];
		list[s2] = temp;
	}
	
}
