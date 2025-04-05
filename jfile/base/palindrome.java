/*A palindromic number is a number that remains the same when its digits are reversed */

import java.io.*;
class palindrome {
	public static void main(String args[])
	throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int num=0, last=0, scnd=0, frst=0, backup=0, reverse=0;
		System.out.print("Enter 3 digit no.:");
		num = Integer.parseInt(br.readLine());
		/*Spilt each digit of input number*/
		backup = num;
		last = num % 10;
		num = num / 10;
		scnd = num % 10;
		num = num / 10;
		frst = num;
		/*Add each digit of number*/
		reverse = (last * 100) + (scnd * 10) + (frst * 1);
		/*checking number whether given number is equal to its reverse number*/
		if (backup == reverse) {
			System.out.println("Number is palindrome.");
		}
		if (backup != reverse) {
			System.out.println("Number is not palindrome.");
		}

	}
}