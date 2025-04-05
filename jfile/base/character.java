import java.io.*;
class character {
	public static void main(String args[])
	throws IOException {
		BufferedReader ab = new BufferedReader(new InputStreamReader(System.in));
		char a;
		System.out.println("Enter a any character.:");
		a = (char) ab.read();
		if ((int)a >= 48 && (int)a <= 57) {
			System.out.println(a + " is a number");
		} else {
			System.out.println(a + " is a alphabet");
		}
	}
}