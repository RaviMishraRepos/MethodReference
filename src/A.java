// reference to static method
interface Caller {
	void call();
}

public class A {

	static void message() {
		System.out.println("static method is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caller c = A::message;
		c.call();

	}

}
