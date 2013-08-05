package sortingAlgoritms;
import java.util.Random;



public class QuickSortTester {

	public static void main(String[] args){
		Random rand = new Random();
		int[] testList = new int[10];
		for(int i=0;i<testList.length;i++){
			testList[i] = rand.nextInt(10);
		}
		System.out.println(arrayString(testList));
		QuickSort.sort(testList);
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
