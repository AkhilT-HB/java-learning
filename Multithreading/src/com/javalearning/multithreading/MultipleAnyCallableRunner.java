package com.javalearning.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks = List.of(new CallableTask("in28minutes"), new CallableTask("Ranga"), new CallableTask("Adam"));
		
		String results = executorService.invokeAny(tasks);
		
		System.out.println(results);
		
		
		executorService.shutdown();


	}

}
