import java.io.*;

class times {
	public static void main(String args[])
			throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int sec = 0, min = 0, hr = 0, time = 0;
		System.out.print("Enter time in second.:");
		sec = Integer.parseInt(br.readLine());
		hr = sec / (60 * 60);
		time = sec % (60 * 60);
		min = time / 60;
		sec = time % 60;
		System.out.println("HOUR\t" + "MINUTE\t" + "  SECOND");
		System.out.println(hr + "   :\t" + min + "    :\t  " + sec);
	}
}