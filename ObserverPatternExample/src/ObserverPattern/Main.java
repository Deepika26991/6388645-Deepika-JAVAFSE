package ObserverPattern;

public class Main {
	public static void main(String[] args) {
        StockMarket market = new StockMarket();

        // Create observers
        Observer mobile1 = new MobileApp("Client1");
        Observer web1 = new WebApp("Client2");

        // Register observers
        market.registerObserver(mobile1);
        market.registerObserver(web1);

        // Change stock price
        market.setStockPrice(1200);
        System.out.println("---");
        market.setStockPrice(1250);
    }
}
