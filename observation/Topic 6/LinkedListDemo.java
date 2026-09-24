import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        // Adding elements
        names.add("Abhi");
        names.add("Kissan");
        names.add("Madhu");

        System.out.println("Original List: " + names);

        // Adding at beginning and end
        names.addFirst("Ravi");
        names.addLast("Pranay");
        System.out.println("After addFirst() and addLast(): " + names);

        // Accessing elements
        System.out.println("Element at index 2: " + names.get(2));
        System.out.println("First Element: " + names.getFirst());
        System.out.println("Last Element: " + names.getLast());

        // Removing elements
        names.remove(2);
        System.out.println("After remove(index): " + names);

        names.remove("Kissan");
        System.out.println("After remove(object): " + names);

        names.removeFirst();
        System.out.println("After removeFirst(): " + names);

        names.removeLast();
        System.out.println("After removeLast(): " + names);

        // Queue operations
        names.offer("Siva");
        names.offer("Rohini");
        System.out.println("After offer(): " + names);

        System.out.println("Peek: " + names.peek());
        System.out.println("Poll: " + names.poll());
        System.out.println("After poll(): " + names);
    }
}