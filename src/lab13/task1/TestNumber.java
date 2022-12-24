package lab13.task1;
import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args)
    {
        System.out.println("Введите номер телефона");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Number number = new Number(str);
        number.convertphone();
        System.out.println("Номер телефона в новом формате: "+number.getPhone());
    }
}
