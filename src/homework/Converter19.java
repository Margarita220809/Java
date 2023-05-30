package homework;

public class Converter19 {

        private String name;

        public Converter19(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int convertToInt(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean");
                return 0;
            } else if (value instanceof String) {
                try {
                    return Integer.parseInt((String) value);
                } catch (NumberFormatException e) {
                    System.out.println("Невозможно выполнить конвертацию в int");
                    return 0;
                }
            } else {
                try {
                    return Integer.parseInt(value.toString());
                } catch (NumberFormatException e) {
                    System.out.println("Невозможно выполнить конвертацию в int");
                    return 0;
                }
            }
        }

        public double convertToDouble(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean");
                return 0.0;
            } else if (value instanceof String) {
                try {
                    return Double.parseDouble((String) value);
                } catch (NumberFormatException e) {
                    System.out.println("Невозможно выполнить конвертацию в double");
                    return 0.0;
                }
            } else {
                try {
                    return Double.parseDouble(value.toString());
                } catch (NumberFormatException e) {
                    System.out.println("Невозможно выполнить конвертацию в double");
                    return 0.0;
                }
            }
        }

        public String convertToString(Object value) {
            return String.valueOf(value);
        }
    }


