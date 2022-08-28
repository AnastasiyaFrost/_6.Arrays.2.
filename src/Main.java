import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        anotherTryTasks();
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void tasks() {
        System.out.print(arr);
        System.out.println("Миссия провалена");
    }

    public static void anotherTryTasks() {
        int[] accounting = {199_000, 151_000, 112_000, 200_000, 138_000, 146_000, 111_000, 176_000, 135_000, 129_000, 118_000, 142_000, 183_000, 164_000, 119_000, 157_000, 129_000, 193_000, 199_000, 126_000, 154_000, 184_000, 176_000, 126_000, 146_000, 142_000, 174_000, 120_000, 175_000, 182_000};
        int sum = 0;
        for (int i = 0; i < accounting.length; i++) {
            sum = sum + accounting[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей.", sum);
        System.out.println();

        int min = 200_000;
        int max = 0;
        for (int i = 0; i < accounting.length; i++) {
            if (accounting[i] < min) {
                min = accounting[i];
            }
            if (accounting[i] > max) {
                max = accounting[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей. ", min, max);
        System.out.println("Средняя сумма трат в день за месяц составила " + sum / (30 * 1.0) + " рублей.");
        System.out.println();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
