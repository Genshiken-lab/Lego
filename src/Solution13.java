import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Как захватить мир
*/
    //Введи с клавиатуры имя и число, а затем выведи на экран строку: Через «число» лет «имя» захватит мир. Му-ха-ха!
//
//Пример:
//Через 8 лет Вася захватит мир. Му-ха-ха!
//
//Последовательность вводимых данных имеет большое значение.
//
//Требования:
//Программа должна выводить текст.
//Программа должна считывать данные с клавиатуры.
//Выведенный текст должен содержать введенное имя.
//Выведенный текст должен содержать введенное число.
//Выведенный текст должен полностью соответствовать заданию.
public class Solution13 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Через " + reader.readLine() + " лет " + reader.readLine() + " захватит мир. Му-ха-ха!");
        }
    }


