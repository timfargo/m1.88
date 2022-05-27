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
        int countDeliveryDays = counDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней:" + countDeliveryDays);
    }

    private static void suggestVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String resultString = buildResultString(clientOS, clientDeviceYear, currentYear);
        System.out.println(resultString);
    }

    private static int counDeliveryDays(int deliveryDistance) {
        int deliveryDays = 4;
        if (deliveryDistance <= 20) {
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 1;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        return deliveryDays;


    }

    private static void printLeapYear(int year) {
        boolean isLeapYear = isLeaoYear(year);
        if (isLeapYear) {
            System.out.println("Год" + year + "высокостный");
        } else {
            System.out.println("Год" + year + "не высокостный");
        }
    }

    private static boolean isLeaoYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}