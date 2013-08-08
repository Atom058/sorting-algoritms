package QuickSortParallell;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QuickSortParallellization {

	public static int[] sort(int[] list){
		if(list == null || list.length == 0){
			return list;
		} else{
			ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
			threadPool.submit(new QuickSortTask(threadPool, list, 0, list.length-1));
			
			return list;
		}
	}

}
