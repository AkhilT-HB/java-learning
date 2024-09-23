package RandomProblems;

public class TestFinancials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countAboveFifteen("1010"));
	}
	
	public static int countAboveFifteen(String hexBytes){
		int counter = 0;
		for(int i=0;i<hexBytes.length();i+=2){
		String value = hexBytes.substring(i,i+2);
		int bytesVal = Integer.parseInt(value,16);

		if(bytesVal > 15){
		counter++;
		}
		}
		return counter;
		}

}
