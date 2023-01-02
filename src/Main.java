import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        determineLeapYear(1976);
        selectApplicationVersion(1, 2021);
        System.out.println(calculateDeliveryTime(11));
    }

    public static void determineLeapYear(int year) {
        System.out.println("Задача 1");

        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " год не является високосным");

        } else {
            System.out.println(year + " год является високосным");
        }
    }

    public static void selectApplicationVersion(int clientOS, int clientDeviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        String a = "";
        String b = "";
        if (clientDeviceYear < currentYear) {
            a = "Установите облегченную версию приложения ";
            System.out.print(a);
        } else {
            b = "Установите версию приложения ";
            System.out.print(b);
        }
        if (clientOS == 0) {
            a = "для IOS по ссылке";
            System.out.println(a);
        } else {
            b = "для Android по ссылке";
            System.out.println(b);
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
