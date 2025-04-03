public class MetodusFugg {

	public static void main(String[] args) {

		int x = 10;
		System.out.println("x = " + x);

		x = duplaz(x);
		System.out.println("x = " + x);
	}

	private static int duplaz(int x) {
		return x *= 2;
	}
}
