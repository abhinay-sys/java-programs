public class ClassCastDemo {
    public static void main(String[] args) {
        Object obj = Integer.valueOf(100);

        try {
            String text = (String) obj;
            System.out.println(text);

        }
         catch (ClassCastException e) {
            System.out.println("Exception Caught");
            System.out.println("Invalid Type Casting");
            System.out.println(e);
        }
        System.out.println("Program Continues");
    }
}

