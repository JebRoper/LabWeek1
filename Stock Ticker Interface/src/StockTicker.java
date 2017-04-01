import java.util.Random;

/**
 * Created by admin on 3/30/17.
 */
public class StockTicker  implements Runnable {

    private static final char[] CHARS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


    @Override
    public void run() {

        Random random = new Random();


        while(true) {
            String tickerName = "" + CHARS[random.nextInt(CHARS.length)] + CHARS[random.nextInt(CHARS.length)] + CHARS[random.nextInt(CHARS.length)];
            double price = random.nextDouble();
            while (price < 1) {
                price = price * random.nextInt(1000);
                price = price == 0 ? random.nextDouble() : price;
            }

            System.out.printf("%s $%.2f  ", tickerName, price);

            sleep(2000L);
        }
    }

    private void sleep(long interval) {
        long start = System.currentTimeMillis();
        long now = System.currentTimeMillis();
        while(now - start < interval) {
            now = System.currentTimeMillis();
        }
    }
}

