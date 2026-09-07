import java.time.LocalDate;

public class Main {
    // Задание №1 Високосный год
    public static void checkYear(int year) {


        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — невисокосный год");
        }

    }

    // Задание № 2 Мобильное приложение
    public static void theMbileApp(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean isOldDevice = deviceYear < 2015;
        if (clientOS == 0 && isOldDevice) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && isOldDevice) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            System.out.println("Операционная система не распознана");
        }

    }

    // Задание №3 Доставка карты
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return -1; // доставки нет
        } else if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else { // от 61 до 100 включительно
            return 3;
        }
    }


    public static void main(String[] args) {

        System.out.println("\n\tЗадание #1\n");
        checkYear(2010);
        checkYear(2020);
        checkYear(2065);
        checkYear(1960);

        System.out.println("\n\tЗадание #2\n");
        theMbileApp(0, 2014); // iOS, старое → облегченная
        theMbileApp(1, 2010); // Android, старое → облегченная
        theMbileApp(0, 2025); // iOS, новое → обычная
        theMbileApp(1, 2026); // Android, новое → обычная

        System.out.println("\n\tЗадание #3\n");
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }

    }
}