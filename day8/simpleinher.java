// -------------------------------SIMPLE inheritance----------------

class A {
	int a, b;

	void input(int x, int y) {
		a = x;
		b = y;
	}
}

class B extends A {
	int s;

	void add() {
		s = a + b;
	}

	void display() {
		System.out.println("Sum is " + s);
	}
}

public class simpleinher {
	public static void main(String[] args) {
		B obj = new B();

		obj.input(10, 22);
		obj.add();
		obj.display();

	}
}