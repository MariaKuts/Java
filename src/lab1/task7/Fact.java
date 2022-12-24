package lab1.task7;
import java.util.Scanner;
public class
Fact {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число, факториал которого необходимо найти: ");
        int f = scan.nextInt();
        System.out.println("Полученное значение: " + getFactorial(f));
    }
}
