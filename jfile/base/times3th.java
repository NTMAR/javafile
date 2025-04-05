import java.io.*;
class times3th {
	public static void main(String args[])
	throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int sec, min, hr;
		System.out.print("Enter time in second.:");
		sec = Integer.parseInt(br.readLine());
		 hr=sec/60;
		 hr=hr/60;
		 min=sec/60;
		 min=min%60;
		 sec=sec%60;
		System.out.println("HOUR\t" + "MINUTE\t" + "  SECOND");
		System.out.println(hr + "   :\t" + min + "    :\t  " + sec);
	}
}