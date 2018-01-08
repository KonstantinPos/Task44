import java.util.Scanner;

public class Main {
    static int a;

    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        scan();
        while ((a <= 0) || (a % 2 != 0)) {
            System.out.println("Вы не выполнили условие, повторите ввод");
            scan();
        }
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) - 5;
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 = sum1 + Math.abs(arr[i]);
        }
        System.out.println();
        System.out.println(sum1);
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 = sum2 + Math.abs(arr[i]);
        }
        System.out.println(sum2);
        if (sum1 > sum2) {
            System.out.println("Сумма модулей левой половины массива больше");
        }
        if (sum2 > sum1) {
            System.out.println("Сумма модулей правой половины массива больше");
        } else if (sum1 == sum2) {
            System.out.println("Сумма модулей  равна");
        }
    }

    static void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите целое положительное число");
        if (!scanner.hasNextInt()) {
            System.out.println("Вы не выполнили условие, повторите ввод");
            scan();
        } else {
            a = scanner.nextInt();
        }
    }
}


