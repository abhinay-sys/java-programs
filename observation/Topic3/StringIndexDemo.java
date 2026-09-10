class StringIndexDemo {
    public static void main(String[] args) {
        try {
            String text = "Java";
            System.out.println(text.charAt(03));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception: String index is out of bounds");
        }
    }
}

