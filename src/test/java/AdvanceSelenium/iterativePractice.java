package AdvanceSelenium;

import java.util.ArrayList;
import java.util.Iterator;

public class iterativePractice {

	public static void main (String []args) {
		
		ArrayList<String>mylist = new ArrayList <>();
		
		
		mylist.add("paul");
		mylist.add("hwy");
		mylist.add("i am ok");
		mylist.add("how r y");
		mylist.add("i am fine");
		
		System.out.print(mylist);
		
		Iterator<String> i = mylist.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
	}
	
}
