import java.io.BufferedReader;
import java.io.InputStreamReader;
   /*Введи с клавиатуры отдельно Имя, число1, число2. Выведи надпись:
            «Имя» получает «число1» через «число2» лет.
            Пример:
    Коля получает 3000 через 5 лет.
            Требования:
    Программа должна выводить текст.
    Программа должна считывать данные с клавиатуры.
    Выведенный текст должен содержать введенное имя.
    Выведенный текст должен содержать введенное число1.
    Выведенный текст должен содержать введенное число2.
    Выведенный текст должен полностью соответствовать заданию.
    */
public class Solution12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String b = reader.readLine();
        String d = reader.readLine();
        System.out.print(s + " получает " + b + " через " + d + " лет.");
    }
}

