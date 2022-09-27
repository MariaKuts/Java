package lab1.task4;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        int s1=0;
        int s2=0;
        int max = -1000000000;
        int min = 1000000000;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите количество элементов массива: ");
        int length = scan.nextInt();
        int[] mass = new int[length];
        int i=0;
        System.out.println("Введите значения элементов массива: ");
        while (i<length)
        {
            mass[i] = scan.nextInt();
            if (mass[i] >= max) max = mass[i];
            s1=s1+ mass[i];
            i++;
        }
        i=0;
        do {
            if (mass[i] <= min) min = mass[i];
            s2=s2+mass[i];
            i++;
        } while (i<length);
        System.out.println("Сумма элементов массива для цикла while: " + s1);
        System.out.println("Сумма элементов массива для цикла do while: " + s2);
        System.out.println("Максимальный элемент в массиве: " + max);
        System.out.println("Минимальный элемент в массиве: " + min);
    }
}
