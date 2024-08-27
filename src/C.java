// reference to constructor
interface Caller3 {
	void call();
}

public class C {

	C() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubz

		Caller3 c = C::new;
		c.call();

//		Caller3 c2 = new Caller3() {
//
//			@Override
//			public void call() {
//				new C();
//			}
//		};
//		c2.call();

	}

}
