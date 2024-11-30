package singletonAndImmutableClassStudy;

public class SingletonTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread1 = new Thread(() -> 
		{
			DBConnection conObj = DBConnection.getInstance();
			System.out.println("Thread 1");
		});
		
		Thread thread2 = new Thread(() -> 
		{
			DBConnection conObj = DBConnection.getInstance();
			System.out.println("Thread 2");
		});
		
	}

}

//class ThreadClass implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}