/*the number in any given number base, which forms the total of the same number, when each of its digits is raised to the power of the number of digits in the number.*/


import java.io.*;
class Armstrong {
	public static void main(String args[])
	throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int num=0, last=0, scnd=0, frst=0, backup=0, added_No=0;
		System.out.println("Enter 3 digit no.:");
		num = Integer.parseInt(br.readLine());
		/*Spilt each digit of input number*/
		backup = num;
		last = num % 10;
		num = num / 10;
		scnd = num % 10;
		num = num / 10;
		frst = num;
		/*Cubes each digit of number*/
		added_No = (last * last * last) + (scnd * scnd * scnd) + (frst * frst * frst);
		/*if backup is equal to added_No than number is Armstrong */
		if (backup == added_No) {
			System.out.println("Number is Armstrong.");
		}
		if (backup != added_No) {
			System.out.println("Number is not Armstrong.");
		}

	}
}