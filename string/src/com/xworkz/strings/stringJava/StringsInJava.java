package com.xworkz.strings.stringJava;

public class StringsInJava {

	public static void main(String[] args) {
		String name = "Vena";
		String nickName = "Vena";
		String nameName = new String("Vena");
		/**
		 * == operator in java is used for reference comparison (address comparison)
		 */
		if (name == nameName) {
			System.out.println("two different reference variable are poiniting to the same object");
		} else {
			System.out.println("two different reference variable are poiniting to the different object");
		}
		/**
		 * .equals is used for content comparison
		 */
		if (name.equals(nameName)) {
			System.out.println("two different reference variable to poiniting to the same object");
		} else {
			System.out.println("two different reference variable to poiniting to the different object");
		}
		/**
		 * length() property returns length os the array
		 */
		System.out.println(name.length());
		/**
		 * charAt() returns character at specific position,return type char
		 */
		System.out.println(name.charAt(4));
		/**
		 * toCharArray() used to convert string to charater of array
		 */
		char[] hesaru = name.toCharArray();
		for (int i = 0; i < hesaru.length; i++) {
			System.out.println(hesaru[i]);
		}
		/**
		 * boolean isEmpty() will check whether string is empty or not.
		 */
		String str = "Good Morning";
		String str1 = "";
		String str2 = " ";

		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());

		/**
		 * String toUpperCase() used to convert String from lowercase to upper
		 */
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		/**
		 * String concat(String) used to concat two String using +operator and concat
		 */

		System.out.println(str + name);
		System.out.println(str.concat(nameName));

		/**
		 * int compareTo() used compare two strings
		 */
		System.out.println(name.compareTo(str));
		/**
		 * codePointAt(int index) used to return unicode of the first character-return
		 * type int
		 */
		String str3 = "Hello";
		System.out.println(str3.codePointAt(0));
		/**
		 * codePointBefore() used to return unicode values of the character before the
		 * specified index
		 */
		System.out.println(str3.codePointBefore(1));
		/**
		 * boolean contains() method is used to find out if a string conatins a sequence
		 * of characetr
		 */
		System.out.println(str3.contains("ll"));

		/**
		 * boolean endWith() method check whether a string ends with specified
		 * characters
		 */
		String bro = "PramoD";
		System.out.println(bro.endsWith("D"));
		System.out.println(bro.endsWith("d"));

		/**
		 * int indexOf() method used to return first position of the frst occurance os
		 * specified character(s) in a String int lastIndexOf() method used to return
		 * last position of the frst occurance os specified character(s) in a String
		 */
		String sentence = "The expert in anything was once a beginner";
		System.out.println(sentence.indexOf("beginner"));
		System.out.println(sentence.lastIndexOf("beginner"));
		/**
		 * String replace() method is to replace character from old to new
		 */
		System.out.println(bro.replace("D", "d"));

		/**
		 * startWith() method is used to check whether a string starts with specified
		 * character os not
		 */
		System.out.println(bro.startsWith("pr"));
		System.out.println(bro.startsWith("Pr"));
		/**
		 * trim() method is used to removes whitespaces from both ends of string
		 */
		String sen = "     self respect is'nt selfish    ";
		System.out.println(sen.trim());

	}

}
