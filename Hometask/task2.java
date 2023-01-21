//Вывести все простые числа от 1 до 1000

public class task2 {
    static boolean isPrime;
    static int counter = 3; 
    static int iterations = 3;

    public static void main(String[] args) {
        
        System.out.println("Таблица простых чисел от 2  до 1000:");

        for (int i = 2; i <= 3; i++) {
            System.out.printf("%5d", i);
        }

        for (int i = 5; i <= 1000; i += 2) {
            isPrime = true;
            for (int j = 3; j < i; j += 2) {
                iterations++;
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%5d", i);
                counter++;
                if (counter % 15 == 0)
                    System.out.println();
            }
        }
    }
}