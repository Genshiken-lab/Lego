import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Введи с клавиатуры три имени, а затем выведи на экран надпись: name1 + name2 + name3 = Чистая любовь, да-да!
    Пример:
    Вася + Ева + Анжелика = Чистая любовь, да-да!

    Требования:
    Программа должна выводить текст.
    Программа должна считывать данные с клавиатуры.
    Выведенный текст должен содержать введенное имя name1.
    Выведенный текст должен содержать введенное имя name2.
    Выведенный текст должен содержать введенное имя name3.
    Выведенный тест должен полностью соответствовать заданию.
    */
    public class Solution14 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String b = reader.readLine();
        String d = reader.readLine();   //напишите тут ваш код
        System.out.print(s + " + " + b + " + " + d + " = Чистая любовь, да-да!");
    }
}

