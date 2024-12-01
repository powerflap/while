public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int days = 10; // изначальное количество дней в Париже

        if (days == 0) {
            System.out.println("Желаем приятной поездки!");
        } else {
            while (days > 0) {
                days--;
                System.out.println("До конца поездки осталось " + days + " дней.");
            }
            System.out.println("Путешествие окончено. Пора возвращаться домой.");
        }
        int points = 10;

        do {
            System.out.println("Осталось " + points + " баллов.");
            points--;
        } while (points >= 0);

        System.out.println("Игра окончена!");


    }
}