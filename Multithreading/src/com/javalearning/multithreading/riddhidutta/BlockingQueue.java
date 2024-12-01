package com.javalearning.multithreading.riddhidutta;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
	
	Queue<Integer> q;
	int capacity;
	
	public BlockingQueue(int cap) {
		q= new LinkedList<>();
		capacity=cap;
	}
	
	public boolean add(Integer item) {
		synchronized (q) {
			while(q.size()==capacity) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			q.add(item);
			q.notifyAll();
			return true;
		}
	}
	
	public boolean remove(Integer item) {
		synchronized (q) {
			while(q.size()==0) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int element = q.poll();
			q.notifyAll();
			return true;
		}
	}
}
