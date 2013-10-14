package com.arthur.simhash;

public class Main {

	/**
	 * @author arthur503
	 * @param argv
	 */
	public static void main(String[] argv){
		String str1 = "this is string1";
		String str2 = "this is string2";
		
		SimHash sim = new SimHash();
		//compare 6 and 8 for test.
		sim.compareString(String.valueOf(6), String.valueOf(8));
		System.out.println();
		
		//compare str1 and str2 for test.
		sim.compareString(str1, str2);
		
		
	}


	
	
}
