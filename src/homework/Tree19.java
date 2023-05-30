package homework;

public class Tree19 {

        private String type;
        private int height;
        private int countOfSticks;
        private String colour;

        public Tree19(String type, int height) {
            this.type = type;
            this.height = height;
            this.countOfSticks = 13;
            this.colour = "Зеленый";
        }

        public Tree19(int height, int countOfSticks, String colour) {
            this.type = "пихта";
            this.height = height;
            this.countOfSticks = countOfSticks;
            this.colour = colour;
        }

        public Tree19() {
            this.height = 350;
            this.countOfSticks = 29;
            this.colour = "Желтый";
        }

        public Tree19(String type) {
            this(); // Вызываем конструктор по умолчанию
            this.type = type;
        }

        // Геттеры и сеттеры для полей

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getCountOfSticks() {
            return countOfSticks;
        }

        public void setCountOfSticks(int countOfSticks) {
            this.countOfSticks = countOfSticks;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }
    }


