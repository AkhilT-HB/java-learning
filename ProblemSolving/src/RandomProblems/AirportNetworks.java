package RandomProblems;

public class AirportNetworks {
	
	public static int getCount(boolean[][] matrix) {
		int n = matrix.length; 
        boolean[] visited = new boolean[n];  
        int components = 0;  
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                difference(i, matrix, visited);
                components++;
            }
        }
        
        return components * (components - 1) / 2;
    }
    
    
    private static void difference(int airport, boolean[][] matrix, boolean[] visited) {
        visited[airport] = true;
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            if (matrix[airport][i] && !visited[i] && Math.abs(airport - i) > 1) {
                difference(i, matrix, visited);
            }
        }
    }

	public static void main(String[] args) {
		boolean[][] matrix = {
	            {false, true, false, false, false},
	            {true, false, false, false, false},
	            {false, false, false, true, false},
	            {false, false, true, false, false},
	            {false, false, false, false, false}
	        };
	        System.out.println(getCount(matrix)); // should print 6

	}

}
