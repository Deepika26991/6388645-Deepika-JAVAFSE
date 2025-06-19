package BuliderPattern;

public class Computer {
    // Required and optional attributes
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;

    // ✅ Step 4: Private Constructor that takes Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    // ✅ Step 2: Static Nested Builder Class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;

        // Setter-style methods return Builder for chaining
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // ✅ Step 3: build() method creates the Computer object
        public Computer build() {
            return new Computer(this);
        }
    }

    // Method to print computer config
    public void displayConfig() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
    }
}
