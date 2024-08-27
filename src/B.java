// reference to instance method
interface Caller2 {
	void call();
}

public class B {

	void message() {
		System.out.println("Message is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caller2 c = new B()::message;
		c.call();
		
	}

}
