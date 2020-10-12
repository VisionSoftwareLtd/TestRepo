class Main {
    public static void main(String... args) {
        Person dave = new Person();
        dave.name = "Dave";
        dave.age = 43;
        String total = addNumbers(3, dave.age);
        String concatenated = dave.name + total;
        System.out.println(concatenated);
    }

    public static String addNumbers(int x, int y) {
        int totalValue = x + y;
        String returnValue = Integer.toString(totalValue);
        return returnValue;
    }
}