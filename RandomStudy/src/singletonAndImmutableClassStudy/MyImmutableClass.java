package singletonAndImmutableClassStudy;

import java.util.ArrayList;
import java.util.List;

final class MyImmutableClass {
	
	private final String name;
	private final List<String> petNameList;
	
	MyImmutableClass(String name, List<String> petNameList){
		this.name = name;
		this.petNameList = petNameList;
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getPetNameList(){
		//This is required to make list final
		//Means we cannot point to a new list, but we can still add and delete from the existing list
		//So we send a copy of the final list every time.
		return new ArrayList<>(petNameList);
	}
}
