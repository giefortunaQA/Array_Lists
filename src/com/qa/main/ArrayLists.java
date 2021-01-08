package com.qa.main;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
	public static void main(String[] args) {
		// EXERCISE -CREATE NEW ARRAY
		ArrayList<String> faveChocolates=new ArrayList<>();
		// ADD ELTS
		faveChocolates.add("Toblerone");
		faveChocolates.add("Maltesers");
		faveChocolates.add("Snickers");
		//PRINT ALL
		System.out.println(faveChocolates);
		//PRINT EACH
		for (String choc: faveChocolates) {
			System.out.println(choc);
		}
		// GET SPECIFIC ELTS
		//first
		System.out.println(faveChocolates.get(0));
		//last
		System.out.println(faveChocolates.get(faveChocolates.size()-1));
		
//		//changing last entry to bounty
		System.out.println(faveChocolates.set(faveChocolates.size()-1, "Bounty"));
		System.out.println(faveChocolates);
		faveChocolates.add("Snickers");
		faveChocolates.add("Cadbury");
//		//changed my mind - I hate Bounty
		faveChocolates.remove(2);
		System.out.println(faveChocolates);
		//sort in alphabetical
		Collections.sort(faveChocolates);
		System.out.println(faveChocolates);
		//reverse method
		Collections.reverse(faveChocolates);
		System.out.println(faveChocolates);
		//swap method
		Collections.swap(faveChocolates,1,2);
		System.out.println(faveChocolates);
		//clone method
		Object faveChocolates2 = faveChocolates.clone();
		System.out.println(faveChocolates2);
//		//empty out the list - if ur a psychopath who dont like chocolates
		
		
		
	
	}
	


}
