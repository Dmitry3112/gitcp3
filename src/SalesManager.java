public class SalesManager {

    protected int[] sales;

    protected long[] sales2;


    public SalesManager(long[] sales2) {
        this.sales2 = sales2;
    }

    public long max() {
        long max = -1;
        for (long  sale : sales2) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales2) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public long  trimmedAvg(){
        long sum = 0;
        for (long  sale : sales2) {
            sum += sale;
        }
        return ( sum - min() - max()) / (sales.length - 2);
    }
}
