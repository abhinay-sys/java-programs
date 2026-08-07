package csmd264;
    abstract class Base {
	int x;
	void sayMyName() {
		System.out.println("My name is Abhinay");
	}
	abstract void sayMyAge();
}
public class Abstract extends Base {
	@Override
	void sayMyAge() {
		System.out.println("my age is: 19");
	}
	public static void main(String[] args) {
		Abstract ad = new Abstract();
		System.out.println(ad.x);
		ad.sayMyName();
		ad.sayMyAge();
	}
}

