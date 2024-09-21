package GFGProblems;

public class StringLongestCommonPrefixOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] arr = {"rn", "an", "nmkhjqc","h", "wsttodxva"};
		String[] arr = {"geeksforgeeks", "geeks", "geek","geezerh"};
		System.out.println(longestCommonPrefix(arr));
	}
	
	public static String longestCommonPrefix(String arr[]) {
        // code here
		
//		System.out.println("geeks".indexOf("geek"));
//
//        int count=0;
//        
//        String temp = arr[0];
//        String longest = "";
//        
//        for(int i=1;i<arr.length;i++){
//        	
//            for(int j=0;j<arr[i].length();j++){
//            	
//                if(arr[i].charAt(j)== temp.charAt(j)) {
//                	count++;
//                }else {
//                	longest = temp.substring(0, count);
//                	break;
//                }  
//            }
//            System.out.println(longest);
//        }
//        
//        
//        if(count > 1){
//            return temp.substring(0, count);
//        }else{
//            return "-1";
//        }
		
		if (arr == null || arr.length == 0) {
            return "-1";
        }
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                if (prefix.isEmpty()) {
                    return "-1";
                }
            }
        }

        return prefix;
    }

}
