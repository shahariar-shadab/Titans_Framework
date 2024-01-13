package AdvanceSelenium;

import java.util.ArrayList;

public class practiceForEachLoop {
	
	public static void main(String []args) {
		
		ArrayList<String> mylist = new ArrayList<>();
		
		mylist.add("paul");
		mylist.add("hwy");
		mylist.add("i am ok");
		mylist.add("how r y");
		mylist.add("i am fine");
		
		System.out.println(mylist);
		
		for(String items: mylist) {
			
			System.out.println(items);
		}
		
	}

}
