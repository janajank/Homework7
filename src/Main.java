import java.text.NumberFormat;

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
        int population = 12_000_000;
        int year = 1;
        int birthPerYear = 17;
        int deathPerYear = 8;
        while(year<=10) {
            population = population + (birthPerYear - deathPerYear)*population/1000;
        System.out.println("Год "+year+" ,численность населения составляет "+population+".");
        year++;
            System.out.println(population);
        }

    }

        public static void task4 () {
        System.out.println("Задача4");
        double sum =15000;
        int total = 12_000_000;
        double percentPerMonth = 0.07;
        int month = 1;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        while(sum <= total) {
            sum = sum*(1+percentPerMonth);
            System.out.println("Месяц "+month+" ,сумма накопления равна "+ numberFormat.format(sum));
            month++;
        }
    }

    public static void task5 () {
        System.out.println("Задача5");
        double sum =15000;
        int total = 12_000_000;
        double percentPerMonth = 0.07;
        int month = 1;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        while(sum <= total) {
            sum = sum*(1+percentPerMonth);
            if(month%6==0) {
            System.out.println("Месяц "+month+" ,сумма накопления равна "+ numberFormat.format(sum));}
            month++;}
    }

    public static void task6 () {
        System.out.println("Задача6");
        double sum = 15000;
        int months  = 12 * 9;
        double percentPerMonth = 0.07;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        for (int month=1; month <= months; month++) {
            sum = sum * (1 + percentPerMonth);
            if(month%6==0) {
                System.out.println("Месяц "+month+" ,сумма накопления равна "+ numberFormat.format(sum));}
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