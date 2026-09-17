public class Trywith1catch {
public static void main(String[] args) {
	int A = 6, B = 0;
	 
	try {
	int K = A/B;
	System.out.println("the value of K: "+ K);
	}catch (ArithmeticException ae){ 
		System.out.println("Arithmetic Exception is not valid ");
}finally {
	System.out.println("final block is excuted:");
		
}
	System.out.println("The above lines are taken from the class is correct");
	System.out.println("The above lines are written in exception class");
	System.out.println("program continues");
}

}