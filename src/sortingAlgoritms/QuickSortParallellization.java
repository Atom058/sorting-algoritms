package sortingAlgoritms;

import java.util.concurrent.Semaphore;

public class QuickSortParallellization {
	
	public static int[] sort(int[] list){
		if(list == null || list.length == 0){
			return list;
		} else{
			try{
				Semaphore semaphore = new Semaphore(1);
				ThreadCounter tc = new ThreadCounter(semaphore);
				(new Thread((new QuickSortThreadTask(tc, list, 0, list.length-1)))).run();
				/*
				 * The semaphore will cause the thread to sleep until 
				 * 	all sorting threads are finished.
				 */
				semaphore.acquire();

			}catch(InterruptedException e){
				System.out.println("Thread interupted, sorting failed");
			}
			return list;
		}
	}

}
