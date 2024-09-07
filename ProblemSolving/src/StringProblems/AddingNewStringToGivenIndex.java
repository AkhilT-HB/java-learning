package StringProblems;

public class AddingNewStringToGivenIndex {

	public static void main(String[] args) {
		
		String originalString = "GeeksGeeeks";
	    String stringToBeInserted = "For"; 
	    int index = 4;
	    
	    String sub1 = originalString.substring(0,index+1);
	    String sub2 = originalString.substring(index+1);
	    
	    //System.out.println(sub2);
	    
	    String output = sub1+stringToBeInserted+sub2;
	    
	    System.out.println(output);
	    
	    //Another Approach using stringbuffer
	    
	    StringBuffer newString = new StringBuffer(originalString);
	    
	    newString.insert(index+1, stringToBeInserted);
	    
	    System.out.println(newString);
	    
	}

}
