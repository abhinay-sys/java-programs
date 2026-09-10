class SecurityExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new SecurityException("Access denied");
        } catch (SecurityException e) {
            System.out.println("Exception: Security access denied");
        }
    }
}

