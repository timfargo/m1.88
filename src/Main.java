import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        // task 1
        int year = 2059;
        printLeapYear(year);


        // task 2
        int clientOS = 1;
        int clientDeviceYear = 2016;
        suggestVersion(clientOS, clientDeviceYear);

        // task 3
        int deliveryDistance = 95;
        int countDeliveryDays = countDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней:" + countDeliveryDays);
    }

    private static void suggestVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear > currentYear) {
            System.out.print("Установите lite-версию для");
        } else {
            System.out.print("Установите версию для");
        }
        if (clientOS == 1) {
            System.out.print("Android");
        } else {
            System.out.print("iOS");
        }
    }


    private static int countDeliveryDays(int deliveryDistance) {
        int deliveryDays = 3;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        return deliveryDays;


    }

    private static void printYear(int year) {
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            printLeapYear(year);
        } else {
            printNonLeapYear(year);
        }
    }

    private static void printLeapYear(int year) {
        System.out.println("Год" + year + "- высокостный");
    }


    private static void printNonLeapYear(int year) {
        System.out.println("Год" + year + "- высокостный");
    }


    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}