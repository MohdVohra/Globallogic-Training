
package com.globallogic.July28;

//Create List and do linear and binary search
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MySearch {

	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		ls.add("Anas");
		ls.add("Vohra");
		ls.add("Ahmed");
		ls.add("Mohd");
		ls.add("Varanasi");
		ls.add("Vadodara");
		ls.add("Sahil");
		System.out.println("Enter the Name to be searched");
		String st = sc.next();
		if (ls.contains(st) == false) {
			System.out.println("Name not in the list");
			System.exit(0);
		}
		Iterator<String> ite = ls.iterator();
		while (true) {
			if (ite.next() == st) {
				System.out.println("Name found");
			    break;
			}
		}

		// Collections.sort(ls);

	}

}