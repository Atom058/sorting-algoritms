package sortingAlgoritms;
import java.util.Random;



public class SortTester {
	
	/**
	 * Here, you can change which sort to use. Fairly simple right now...
	 * @param list - the list to be sorted
	 */
	private static void sort(int[] list){
		//QuickSort.sort(list);
		MergeSort.sort(list);
	}

	public static void main(String[] args){
		Random rand = new Random();
		int[] testList = new int[10];
		for(int i=0;i<testList.length;i++){
			testList[i] = rand.nextInt(10);
		}
		System.out.println(arrayString(testList));
		sort(testList);
		System.out.println(arrayString(testList));
	}
	
	private static String arrayString(int[] list){
		StringBuilder s = new StringBuilder();
		for(int i=0; i<list.length; i++){
			s.append(list[i]);
		}
		return s.toString();
	}
}
