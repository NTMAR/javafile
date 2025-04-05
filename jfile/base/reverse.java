import java.io.*;

class reverse {
	public static void main(String args[])
			throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int num = 0, last = 0, scnd = 0, frst = 0, answer = 0;
		System.out.print("Enter 3 digit no.:");
		num = Integer.parseInt(br.readLine());
		last = num % 10;
		num = num / 10;
		scnd = num % 10;
		num = num / 10;
		frst = num;
		answer = 100 * last + 10 * scnd + 1 * frst;
		System.out.println(answer + " is reverse of entered number.");

	}
}