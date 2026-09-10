public class ClassNotFound {

public static void main(String[] args) {

    try {
        Class.forName("Student");
        System.out.println("Class Loaded Successfully");
    }

    catch (ClassNotFoundException e) {

        System.out.println("Exception Caught");
        System.out.println("Class Not Found");
        System.out.println(e);
    }

    System.out.println("Program Continues");
}
}
