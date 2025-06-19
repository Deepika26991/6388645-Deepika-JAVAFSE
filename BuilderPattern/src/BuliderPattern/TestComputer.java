package BuliderPattern;

public class TestComputer {
    public static void main(String[] args) {
        // Basic computer
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("4GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Basic Computer Configuration:");
        basicComputer.displayConfig();

        System.out.println("-----------------------------");

        // Gaming computer
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .build();

        System.out.println("Gaming Computer Configuration:");
        gamingComputer.displayConfig();
    }
}

