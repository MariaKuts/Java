package lab1.task3;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        int s = 0;
        double sr = 0;        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите количество чисел в массиве: ");
        int length = scan.nextInt();
        int[] mass = new int[length];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < length; i++) {
            mass[i] = scan.nextInt();
            s = s + mass[i];
        }
        sr = ((double)s)/length;
        System.out.println("Сумма чисел в массиве: " + s);
        System.out.println("Среднее арифметическое чисел в массиве: " + sr);
    }
}