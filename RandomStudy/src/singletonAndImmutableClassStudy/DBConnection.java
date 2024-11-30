package singletonAndImmutableClassStudy;

//Singleton classes, various ways and disadvantages of each
// 1 - Eager Initialization : 
//As soon as app is started the static variable is preloaded in the memory
//This is a disadvantage, as even when we are not using the getInstance, something is already created in the memory

/*public class DBConnection {
	private static DBConnection connectionObject = new DBConnection();
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		return connectionObject;
	}
	
}*/

// 2 - Lazy Initialization
//In the case if Thread1 comes and creates connectionObject the memory is allocated and then the Thread2 comes and accesses
//connectionObject it will see that obj is already created so it will simply return the connectionObject that was already created
//in the memory by Thread1
//But the DISADVANTAGE is that, if Thread1 comes and sees null and tries to create obj and parallelly Thread2 also does the same, thread2 
//too sees the null connection object and creates the obj, thus 2 instances are created. 
/*public class DBConnection{
	private static DBConnection connectionObject;
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		if(connectionObject==null) {
			connectionObject=new DBConnection();
		}
		return connectionObject;
	}
}*/



// 3 - Synchronised Method
//In this case since the getInstance methond is Synchronised, only one thread can access it and create the connectionObject, when two
//threads comes parallely
// Disadvantage is that since we are putting Synchronized in method level, this makes the program too slow, consider getInstance is 
// called at 100s of places, and there are 1000s of threads requiring this obj not parallely but sequentially one after another, 
// then even though one thread gains lock and create the object, 
// still the other threads will have to go inside the method to see if the obj is null or not and then return (if it is not
// null, then the time is wasted by the thread to go access and see its null and return, the rest of the 
// threads will have to wait for each of the thread to go do this. So if 1000 threads are there 
/*public class DBConnection{
	private static DBConnection connectionObject;
	
	private DBConnection() {
		
	}
	
	synchronized public static DBConnection getInstance() {
		if(connectionObject == null) {
			connectionObject = new DBConnection();
		}
		
		return connectionObject;
	}
}*/


// 4 - DoubleCheck Locking system
// In this case instead of making the entire method synchronized, we create a synchronized block inside the getInstance method,
// but before the block we check if the connectionObj is null or not, this will ensure that even if we have multiple threads they
// won't need to lock and unlock and waste time to see if the connectionObject was already created or not 
// VERY IMPORTANT - VOLATILE keyword is used to ensure that the object is directly created in the memory rather than cache
// Still this way of DoubleCheck is slow, as we are using volatile, so it is not using cache so its slow, and also we are using
// sysnchronised so that too makes it slow
/*public class DBConnection{
	
	private static volatile DBConnection connectionObject;
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		if(connectionObject == null) {
			synchronized(DBConnection.class) {
				if(connectionObject==null) {
					connectionObject = new DBConnection();
					System.out.println("Connection created");
				}
			}
		}
		return connectionObject;
	}
}*/


// 5 - Bill Pugh Solution
// This way is by making use of eager initialization but the disadvantage of eager initialization is resolved by using a nested class
// and initializing the object inside the nested class as it does not get loaded at the time of application start.
public class DBConnection{
	
	private DBConnection() {
		
	}
	
	private static class DBConnectionHelper{
		private static final DBConnection INSTANCE_OBJECT = new DBConnection();
	}
	
	public static DBConnection getInstance() {
		return DBConnectionHelper.INSTANCE_OBJECT;
	}
}


// 6 - ENUM
// In Enum by default all constructors are private and by default as per JVM only one object +/snapshot of ENUM is present.
// So ENUM is default singleton
// Also, ENUM takes care that only one INSTANCE is present in JVM
/*enum DBConnection{
	INSTANCE;
}*/

