package ObserverPattern;

public class MobileApp implements Observer {
 private String name;

 public MobileApp(String name) {
     this.name = name;
 }

 @Override
 public void update(float newPrice) {
     System.out.println(name + " Mobile App: Stock price updated to ₹" + newPrice);
 }
}

