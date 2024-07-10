package com.javalearning.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}

	public int getJ() {
		return j;
	}

	Map<Character, LongAdder> occurences = new Hashtable<>();

	// String str = "ABCD ABCD ABCD";

	for(
	char character:str.toCharArray())
	{
		LongAdder longAdder = occurences.get(character);
		if (longAdder == null) {
			longAdder = new LongAdder();
		}
		longAdder.increment();
		occurences.put(character, longAdder);
	}
	System.out.println(occurences);
}
