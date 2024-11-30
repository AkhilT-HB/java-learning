package singletonAndImmutableClassStudy;

import java.util.ArrayList;
import java.util.List;

public class ImmutableTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> petNameList = new ArrayList<>();
		petNameList.add("Tony");
		petNameList.add("Bruno");
		
		MyImmutableClass immutableClassObj = new MyImmutableClass("Happy", petNameList);
		
		String name = immutableClassObj.getName();
		List<String> immClassPetListObj = immutableClassObj.getPetNameList();
		
		System.out.println(name);
		System.out.println(immClassPetListObj);
		
		immClassPetListObj.add("Jibbru");
		System.out.println(immClassPetListObj);
		
		System.out.println(immutableClassObj.getPetNameList());
		
	}

}
