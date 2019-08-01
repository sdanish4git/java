package com.basics;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringExamples();
		//stringPool();
	}
	static void stringExamples() {
		System.out.println("\nInside stringExamples ...");
		String s = "hello world!";
		System.out.println("s: " + s);
		
		System.out.println("\ns.length(): " + s.length());
		System.out.println("s.isEmpty(): " + s.isEmpty());
		
		// Comparison
		System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!"));
		System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println("s.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!"));
		
		// Searching
		System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
		System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
		System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
		System.out.println("s.startsWith(\"hello world!\"): " + s.startsWith("hello world!"));
		System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
		System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo"));
		System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));
		System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));
		
		// Examining individual characters
		System.out.println("\ns.charAt(4): " + s.charAt(4));
		
		// Extracting substrings
		System.out.println("\ns.substring(4): " + s.substring(4));
		System.out.println("s.substring(4, 9): " + s.substring(4, 9));
		
		// Case conversions
		System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.toLowerCase(): " + s.toLowerCase());
		
		System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string after trimming any leading & trailing white spaces
		
		// Replace
		System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));
		
		// Split
		System.out.println("\ns.split(\"o\"): ");
		String[] sa = s.split("o");
		for (String temp : sa) {
			System.out.println(temp);
		}
		
		System.out.println("\ns.valueOf(1.3): " + s.valueOf(1.3));
	}
	static void stringPool() {
		  System.out.println("\nInside stringPool ...");
		  String s1 = "hello!";
		  String s2 = "hello!";
		  String s3 = "hello!".intern();
		  String s4 = new String("hello!");	 
		  String s5 = "lo!";

	      System.out.println("s1 == s2: " + (s1 == s2));
	      System.out.println("s1 == s3: " + (s1 == s3));
	      System.out.println("s1 == s4: " + (s1 == s4));
	      System.out.println("s1 == s4.intern(): " + (s1 == s4.intern()));
	      System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));
	      System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5));
	    }

}