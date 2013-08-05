package sortingAlgoritms;

public class BubbleSort {
	
	public static int[] sort(int[] list){
		if(list == null || list.length <= 0){
			return list;
		}
		boolean changed;
		do {
			changed = false;
			for(int i=1; i<list.length; i++){
				if(list[i-1] > list[i]){
					swap(list, i-1, i);
					changed = true;
				}
			}
		} while(changed);
		return list;
	}
	
	private static void swap(int[] list, int i, int j){
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}
