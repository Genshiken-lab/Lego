import java.util.Scanner;

public class Scan2num {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Сумма этих чисел = "+(a+b));
    }
}

