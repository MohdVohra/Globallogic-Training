//Create List of Student and perform the below operation : Add the data ,delete ,update ,remove , sort the list and print
package com.globallogic.July20;
import java.util.ArrayList;
import java.util.Collections;

public class MyList {
	public static void main(String[] args) {
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("Anas");
		ls.add("Vohra");
		System.out.println(ls);
		ls.remove(1);
		
		ls.add("Mohd");
		ls.add("Varanasi");
		ls.add("Vadodara");
		ls.add("Sahil");
		Collections.sort(ls);
		System.out.println(ls);
		ls.clear();
		System.out.println(ls);
		
		
	}

}
