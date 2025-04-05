import java.io.*;
class convertkm {
	public static void main(String args[])
	throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		double m, cm, km;
		System.out.print("Enter length in cm.:");
		cm = Double.parseDouble(br.readLine());
		m = cm / 100;
		km = m / 1000;
		System.out.println(cm + " cm = " + m + "m" + "\n" + cm + " cm = " + km + "km");
	}
}