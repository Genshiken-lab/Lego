public class Bearsong2 {
    public static void main(String[] args) {
        int beerNum = 99;
        while (beerNum > 0) {
            String word = getWord(beerNum);
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            word = getWord(--beerNum);
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }

    private static String getWord(int beerNum) {
        if ((beerNum % 100 > 10 && beerNum % 100 < 20) ||
                beerNum % 10 > 4 || beerNum % 10 == 0) { //если заканчивается на 5,6,7,8,9,0 - то "бутылок"
            return "бутылок";
        }
        if (beerNum % 10 > 1) { //заканчивается на 2,3,4 - то "бутылки"
            return "бутылки";
        }
        return "бутылка"; //заканчивается на 1 - "бутылка"
    }
}