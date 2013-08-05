package sortingAlgoritms;
import java.util.Arrays;
import java.util.Random;



public class SortTester {
	
	private static Random rand;
	
	public static void main(String[] args){
		rand = new Random();

		generateTest(10);
		generateTest(100);
		generateTest(1000);
		generateTest(10000);
		generateTest(100000);
	}
	
	private static void generateTest(int length){
		int[] list = generateList(length);
		
		System.out.println(length + " random numbers");
		arrayToString(list);
		
		System.out.print("Bubble sort: ");
		int[] testList = Arrays.copyOf(list, list.length);
		long time = System.currentTimeMillis();
		BubbleSort.sort(testList);
		time = System.currentTimeMillis() - time;
		System.out.println("Duration: " + time);
		
		System.out.print("Merge sort: ");
		testList = Arrays.copyOf(list, list.length);
		time = System.currentTimeMillis();
		MergeSort.sort(testList);
		time = System.currentTimeMillis() - time;
		System.out.println("Duration: " + time);
		
		System.out.print("Quick sort: ");
		testList = Arrays.copyOf(list, list.length);
		time = System.currentTimeMillis();
		QuickSort.sort(testList);
		time = System.currentTimeMillis() - time;
		System.out.println("Duration: " + time);
	}
	
	private static int[] generateList(int length){
		int[] list = new int[length];
		for(int i=0; i< list.length; i++){
			list[i] = rand.nextInt(10);
		}
		return list;
	}
	
	private static String arrayToString(int[] list){
		StringBuilder s = new StringBuilder();
		for(int i=0; i<list.length; i++){
			s.append(list[i]);
		}
		return s.toString();
	}
}
