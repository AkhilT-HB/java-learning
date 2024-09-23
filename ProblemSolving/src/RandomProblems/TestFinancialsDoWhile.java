package RandomProblems;

public class TestFinancialsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculate(5));
	}
	
	static int calculate(int positiveNumber) {
		do {
			if(positiveNumber%2==0) {
				positiveNumber = positiveNumber * 2;
				System.out.println("even is:"+positiveNumber);
			}else {
				positiveNumber = (3*positiveNumber)+1;
				System.out.println("odd is:"+positiveNumber);
			}
		}while(positiveNumber != 1);
		
		return positiveNumber;
	}

}
