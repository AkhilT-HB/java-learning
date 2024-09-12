package ConcurrentCollections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapPractice {
	private static final int NUM_THREADS = 5;
	
	private static final int NUM_INSERTIONS = 100;
	
	private static ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>();
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
		
		for(int i=0;i<NUM_THREADS;i++) {
			executorService.execute(insertRecords());
		}
		
		executorService.shutdown();
		
		if(!executorService.isTerminated()) {
			Thread.sleep(1000);
		}
		
		System.out.println("Size of the hashMap is: "+hashMap.size());
	

	}

	private static Runnable insertRecords() {
		
		return () -> {
			for(int i=0;i<NUM_INSERTIONS;i++) {
				hashMap.put(i+Thread.currentThread().getName(), i);
			}
		};
	}

}
