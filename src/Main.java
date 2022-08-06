public class Main {

    public static void leapAndPrintYears(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void getAndPrintClientOS(int clientOS, int year2) {
        if (clientOS == 0 && year2 == 2022) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && year2 < 2022) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year2 == 2022) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && year2 < 2022) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша ОС не обслуживается");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance < 20 && distance > 0) {
            return 1;
        } else if (distance < 60 && distance >= 20) {
            return 2;
        } else if (distance < 100 && distance >= 60) {
            return 3;
        } else {
            throw new RuntimeException("Доставка не может быть произведена");
        }

    }


    public static void main(String[] args) {

        //task 1 Високосные года
        int year = 2017;
        leapAndPrintYears(year);

        //task 2 OS
        int clientOS = 1;
        int year2 = 2020;
        getAndPrintClientOS(clientOS, year2);

        //task 3 дистанция
        int deliveryDistance = 95;
        System.out.println("Количество дней доставки составит: " + calculateDeliveryDays(deliveryDistance));
    }
}