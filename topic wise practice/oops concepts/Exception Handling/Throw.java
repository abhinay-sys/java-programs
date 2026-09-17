public class Throw {
public static void main(String[] args) {
	int balance = 5000;
	int withdraw = 7000;
	
	try {
		if (withdraw > balance) {
			throw new ArithmeticException("Insufficient balance"); 
	}
	 balance = balance - withdraw; 
	 System.out.println("Withdrawal successful"); 
	 System.out.println("Remaining balance: " + balance);
	}catch(ArithmeticException ae) {
		System.out.println("Exception: " + ae.getMessage());
 }finally {
	System.out.println("final block is excuted:");
		
}
	System.out.println("program continues");
}
}