package RandomProblems;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		
		System.out.println(fibonacci(num));
		System.out.println(fibonacciWithoutRecursion(num));
	}
	
	private static long fibonacci(int num) {
		
		if(num<=1) {
			return num;
		}
		
		return fibonacci(num-1)+fibonacci(num-2);
	}
	
	private static long fibonacciWithoutRecursion(int num) {
		
		int n1=0;
		int n2=1;
		
		int n3=0;
		
		for(int i=2;i<num;i++) {
			n3 = n1+n2;
			
			n1=n2;
			n2=n3;
		}
		
		return n3;
		
		
		
	}

}
