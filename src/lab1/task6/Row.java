package lab1.task6;
import java.util.Scanner;
public class Row {
    public static void main(String[] args) {
        double k;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            k = 1/((double)i);
            String str = String.format(" число гармонического ряда: %f", k);
            System.out.println(str);
        }
    }
}
