package eh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trywith2catch {
public static void main(String[] args) {
	int A = 6;
	 int B;
	      System.out.println("Enter the number or characters :");
	      Scanner Sc1 = new Scanner(System.in);

	try {
     B = Sc1.nextInt();
	int K = A/B;
	     System.out.println("The value of K: "+ K);
	}catch (ArithmeticException ae){ 
		 System.out.println("Arithmetic is not valid ");
	}catch (InputMismatchException ime) {
	 	 System.out.println("InputMismatchException is not valid ");
	}finally {
		System.out.println("final block is excuted:");
		
	}
 	
    	 System.out.println("The above lines are taken from the class is correct");
	     System.out.println("The above lines are written in exception class");	
	 Sc1.close();
}
}