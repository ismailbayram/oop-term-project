
public class Main {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		Time t1 = new Time(22, 55);
		Time t2 = new Time(14, 54);
		System.out.println(t1.getDifference(t2));
	}
}
