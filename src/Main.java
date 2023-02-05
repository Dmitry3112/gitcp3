public class Main {
    public static void main(String[] args) {
        long [] sales2 = { 10, 2, 333, 44};
        SalesManager manager = new SalesManager(sales2);
        System.out.println("Макс: " + manager.max());
    }
}
