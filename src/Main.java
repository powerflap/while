import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1  ");
        int total = 0;
        int can = 15000;
        int k = 0;

        for (; total < 2_459_000; k++) {
            total += (int) (total * 0.01);
            total = total + can;
            if (total > 2_459_000) {
                System.out.println("Месяц " + k + " сумма накоплений равна " + total + " рублей");
            }

        }
        System.out.println("Задание 2  ");

        int start = 1;
        while (start < 11) {
            System.out.print(" " + start + " ");
            start = start + 1;
        }
        System.out.println();

        for (int r = 10; r >= 1; r--) {
            System.out.print(" " + r + " ");
        }
        System.out.println();
        System.out.println("Задание 3  ");

        int population = 12_000_000;
        int year = 0;
        int deathRate = 8;
        int birthRate = 17;
        int raznica = birthRate - deathRate;

        for (year = 0; year <= 10; year++) {
            int populationNext = population + (population * raznica / 1000);
            System.out.println("Год " + year + ", численность населения составляет " + populationNext + ".");
            population = populationNext;
        }
        System.out.println("Задание 4  ");
        int canCan = 15000;
        int total2 = 0;
        int d = 1;
        for (; total2 < 12_000_000; d++) {
            total2 = total2 + canCan;
            total2 += (int) (total2 * 0.07);


            System.out.println("Месяц " + d + " сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println("Задание 5  ");

        int canCanCan = 15000;
        int total3 = 0;
        int f = 1;

        for (; total3 < 12000000; f++) {
            total3 = total3 + canCanCan;
            total3 += (int) (total3 * 0.07);

            if (f % 6 == 0) {
                System.out.println("Месяц " + f + " сумма накоплений равна " + total3 + " рублей");
            }
        }
        System.out.println("Задание 6  ");
        int canCanCanCan = 15000;
        int total4 = 0;
        int n = 1;
        for (; n <= 108; n++) {
            total4 = total4 + canCanCanCan;
            total4 += (int) (total4 * 0.07);
            if (n % 6 == 0) {


                System.out.println("Месяц " + n + " сумма накоплений равна " + total4 + " рублей");
            }
        }
        System.out.println("Задание 7  ");

        int pyatnica = 2;
        System.out.println("Сегодня пятница, " + pyatnica + "-е число. Необходимо подготовить отчет");
        while (pyatnica <= 31) {
            pyatnica++;

            if (pyatnica % 7 == 0) {
                System.out.println("Сегодня пятница, " + pyatnica + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println("Задание 8  ");

        int startYear = 1824;
        int endYear = 2124;


        for (int yeat = startYear; yeat <= endYear; yeat++) {
            if (yeat % 79 == 0) {
                System.out.println(yeat);
            }
        }

    }
}











