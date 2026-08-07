package csmd264;
class One{
	int x = 10;
	float calc_si(float p, int t, float r) {
		float si = (p*t*r)/100;
		return si;
	}
}
class Two extends One{
	float calc_si(float p, int t, float r) {
		float si = (p*t*r)/10;
		return si;
	}
	void access(){
		float result = calc_si(10000, 3, 3.45f);
		System.out.println("SI value is: " + result);
	}
}
class Three extends One{
	@Override
	float calc_si(float p, int t, float r) {
		float si = (p*t*r)/1000;
		return si;
	}
	void access() {
		float result = calc_si(10000, 3, 3.45f);
		System.out.println("SI value is: " + result);
	}
}
public class Hierarichal{
	public static void main(String[] args) {
		Three three = new Three();
		three.access();
	}
}
