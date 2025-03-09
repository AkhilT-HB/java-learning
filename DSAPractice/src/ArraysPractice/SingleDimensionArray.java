package ArraysPractice;

public class SingleDimensionArray {
	
	int[] arr = null;
	
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	public void insert(int location, int valueToBeInserted) {
		try {
			if(arr[location]==Integer.MIN_VALUE) {
				arr[location]=valueToBeInserted;
				System.out.println("Successfully Inserted");
			}else {
				System.out.println("This cell is already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index of the array!");
		}
	}
	
	//Array Traversal
	
	public void traverseArray() {
		try {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}catch(Exception e){
			System.out.println("Array doesn't exist!");
		}
		
	}
	
	
	
	public void searchInArray(int valueToSearch) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==valueToSearch) {
				System.out.println("Value is found at the index "+i);
				return;
			}
		}
		System.out.println(valueToSearch + " is not found");
	}
	
	public void deleteValue(int valueToDeleteIndex) {
		try {
			arr[valueToDeleteIndex]=Integer.MIN_VALUE;
			System.out.println("The value has been deleted");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The value provided is not in the range");
		}
	}

}
