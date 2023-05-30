package homework;

public class Computer19 {

        private String brand;
        private int price;
        private int ram;
        private int gpu;

        public Computer19(String brand, int price, int ram, int gpu) {
            this.brand = brand;
            this.price = price;
            this.ram = ram;
            this.gpu = gpu;

            System.out.println("Создан PC.");
            System.out.println("Имя = " + brand);
            System.out.println("Цена = " + price);
            System.out.println("Видеокарта = " + gpu);
            System.out.println("ОЗУ = " + ram);
        }

        public String getBrand() {
            return brand;
        }

        public int getPrice() {
            return price;
        }

        public int getRam() {
            return ram;
        }

        public int getGpu() {
            return gpu;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public void setGpu(int gpu) {
            this.gpu = gpu;
        }

        public void printInfo() {
            System.out.println("Марка: " + brand);
            System.out.println("Цена: " + price);
            System.out.println("Оперативная память: " + ram);
            System.out.println("Видеокарта: " + gpu);
        }
    }


