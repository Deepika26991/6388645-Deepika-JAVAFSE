package Image;
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        image1.display(); // Loads and displays photo1
        image1.display(); // Only displays (no reloading)

        image2.display(); // Loads and displays photo2
    }
}
