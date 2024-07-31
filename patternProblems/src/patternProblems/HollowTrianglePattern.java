package patternProblems;

public class HollowTrianglePattern {

	public static void main(String[] args) {
		int n=6;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=(n-i);j++) {
				System.out.print("+");
			}
			
			System.out.print("*");
			
			
			if(i>1) {
				for(int j=1;j<i;j++) {
					System.out.print("+");
				}
				System.out.print("*");
			}
			
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
			
			System.out.println();
			
		}
		
	}

}

