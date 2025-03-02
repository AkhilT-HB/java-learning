package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Project1Arrays {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("How many day's temperatures? ");
	    int noOfDays = sc.nextInt();
	    
	    int[] temp = new int[noOfDays];
	    
	    int sum=0;
	    double avg=0;
	    
	    for(int i=0;i<temp.length;i++) {
	    	System.out.println("Day "+i+" high temperature: ");
	    	temp[i] =sc.nextInt();
	    	sum=sum+temp[i];
	    }
	    
	    //System.out.println(Arrays.toString(temp));
	    //System.out.println(sum);
	    avg = sum/temp.length;
	    System.out.println("Average temperature is: "+avg);
	    
	    int daysAbvAvg=0;
	    
	    for(int i=0;i<temp.length;i++) {
	    	if(temp[i]>avg) {
	    		daysAbvAvg++;
	    	}
	    }
	    
	    System.out.println(daysAbvAvg+" days above average");
	    
	}
    
}
