public class Bearsong {
    //В коде есть одна ошибка. Он скомпилируется и запустится, но результат будет не таким,
    // как ожидается. Поищите эту ошибку и попробуйте исправить
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылки";
        //String word2 = "бутылок";
        while (beerNum > 0) {
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum == 1) {
                word = "бутылка";
            }
                    if (beerNum > 0) {
                        System.out.println(beerNum + " " + word + " пива на стене");
                    } else {
                        System.out.println("Нет бутылок пива на стене");
                    }
                }
            }
        }