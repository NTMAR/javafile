class nothing {
	public static void main(String args[]) {
		int i, j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 12; j++) {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
			}
			System.out.print("\n");
		}
	}
}