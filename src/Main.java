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
    public static void task1 () {
        System.out.println("Задача1");
    int total = 2_459_000;
    int month = 1 ;
    int sum = 0;
    int sumPerMonth = 15_000;
    while (sum <= total) {
        sum = sum + sumPerMonth;
        System.out.println("Месяц "+ month + ", сумма накоплений равна "+sum+" рублей");
        month++;}
    }
    public static void task2 () {
        System.out.println("Задача2");
        int i = 0;
        while(i<=9) {
           i++;
        System.out.print(i+" ");}
        System.out.println();

        for (i=10; i>0; i=i-1) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void task3 () {
        System.out.println("Задача3");
        int sum = 12_000_000;
        int year = 1;
        int peoplePerYear =108000;
        while(year<=10) {
            sum = sum + peoplePerYear;
        System.out.println("Год "+year+" ,численность населения составляет "+sum+".");
        year++;
            System.out.println(sum);
        }

    }

        public static void task4 () {
        System.out.println("Задача4");
        int sum =15000;
        int total = 12_000_000;
        int percentPerMonth = 1050;
        int month = 1;
        while(sum <= total) {
            sum = sum + percentPerMonth;
            System.out.println("Месяц "+month+" ,сумма накопления равна "+sum);
            month++;
        }
    }

    public static void task5 () {
        System.out.println("Задача5");
        int sum =15000;
        int total = 12_000_000;
        int percentPerMonth = 1050;
        int month = 6;
        while (sum <= total) {
            sum = sum + 6*percentPerMonth;
            System.out.println("Месяц "+month+" ,сумма накопления равна "+sum);
            month = month + 6; }

    }

    public static void task6 () {
        System.out.println("Задача6");
        int sum = 6300;
        int halfYear = 0;
        int percentPerHalfYear = 6300;
        while (halfYear < 18) {
            halfYear++;
            System.out.println("За полугодие "+halfYear+" накопление состовляет "+sum+" рублей.");
            sum = sum + percentPerHalfYear;
        }
    }

    public static void task7 () {
        System.out.println("Задача7");
        int firstFridayInMonth = 3;
        for (int friday = firstFridayInMonth;friday <= 31; friday+=7) {
        System.out.println("Сегодня пятница, "+ friday + "-е число.Необходимо подготовить отчет.");}
    }

    public static void task8 () {
        System.out.println("Задача8");
        int firstFlyYear = 0;
        int period = 79;
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = firstFlyYear; year <= end; year += period) {
            if (year >= start) {
                System.out.println(year);
            }
        }
    }



}