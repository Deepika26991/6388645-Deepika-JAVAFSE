package ObserverPattern;

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(float newPrice) {
        System.out.println(name + " Web App: Stock price updated to ₹" + newPrice);
    }
}

