public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + contribution;
            System.out.println("Месяц" + month++ + ", сумма накоплений равна" + total + "рублей");
        }
        System.out.println(total);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int a = 10;
        int i = 0;
         while (++i <= a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (a = 10;a > 0;a = a - 1) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int growthPeople = birthRate - mortality;
        for (int year = 1;year <= 10; year++) {
            population += population * growthPeople / 1000;
            System.out.println("Год" + year + ", численность населения составляет" + population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15000;
        int month = 0;
        while (contribution <= 12_000_000) {
            contribution = contribution + contribution / 100 * 7;
            month++;
            System.out.println("Месяц" + month + ", сумма равна " + contribution);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15000;
        int month = 0;
        while (contribution <= 12_000_000) {
            contribution = contribution + contribution / 100 * 7;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц" + month + ", сумма равна" + contribution);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15000;
        int month = 0;
        while (contribution <= 12_000_000) {
            contribution = contribution + contribution / 100 * 7;
            month++;
            if (month <= 9 * 12 && month % 6 == 0) {
                System.out.println("Месяц" + month + ", сумма равна" + contribution);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        do {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        while (friday < 31);
    }
    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int futureYears = year + 100;
        int pastYears = year - 200;
        for (year = pastYears; year <= futureYears; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}