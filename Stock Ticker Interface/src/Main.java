public class Main {

    public static void main(String[] args) {
        StockTicker stockTicker = new StockTicker();
        Thread thread = new Thread(stockTicker);
        thread.start();



    }
}
