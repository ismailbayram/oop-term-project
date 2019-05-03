
public class Main {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		Date d1 = new Date(11, 2, 2019);
		Date d2 = new Date(11, 3, 2019);
		System.out.println(d2.isBeforeThan(d1));
	}
}
