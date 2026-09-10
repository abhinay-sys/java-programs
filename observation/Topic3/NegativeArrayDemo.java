class NegativeArrayDemo {
    public static void main(String[] args) {
        try {
            int size = -5;
            int[] numbers = new int[size];
            System.out.println(numbers.length);
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception: Array size cannot be negative");
        }
    }
}

