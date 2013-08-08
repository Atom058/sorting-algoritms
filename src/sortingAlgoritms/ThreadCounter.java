package sortingAlgoritms;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCounter {
	AtomicInteger threadCount = new AtomicInteger();
	Semaphore semaphore;
	
	public ThreadCounter(Semaphore semaphore) throws InterruptedException{
		this.semaphore = semaphore;
		semaphore.acquire();
	}
	
	public void add(){
		threadCount.incrementAndGet();
	}
	
	public void remove(){
		if(threadCount.decrementAndGet() == 0){
			semaphore.release();
		}
	}
	
}
