import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        determineLeapYear(2009);
        selectApplicationVersion(0, 2000);
        System.out.println(calculateDeliveryTime(11));
    }

    public static void determineLeapYear(int year) {
        System.out.println("Задача 1");
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static void selectApplicationVersion(int clientOS, int clientDeviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }
    }


    public static String calculateDeliveryTime(int deliveryDistance) {
        System.out.println("Задача 4");
        String result;
        int deliveryArea1 = 1;
        int deliveryArea2 = deliveryArea1 + 1;
        int deliveryArea3 = deliveryArea2 + 1;
        if (deliveryDistance < 20) {
            return "Потребуется дней: " + deliveryArea1;
        } else if (deliveryDistance < 60) {
            return "Потребуется дней: " + deliveryArea2;
        } else if (deliveryDistance < 100) {
            return "Потребуется дней: " + deliveryArea3;
        } else {
            return "Доставки нет";
        }
    }
}
