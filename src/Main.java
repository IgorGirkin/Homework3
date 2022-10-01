public class Main {
    public static void main(String[] args) {
        int masha= 67760;
        float motivationMasha=masha+masha*0.1F;
        int denchik =83690;
        float motivationDenchik=denchik+denchik*0.1F;
        int kris =76230;
        float motivatiomKris=kris+kris*0.1F;
        System.out.println("Маша теперь получает "+ motivationMasha+" рублей в месяц. Годовой доход " +
                "вырос на " +(motivationMasha-masha)*12+" рублей.");
        System.out.println("Денис теперь получает "+ motivationDenchik+" рублей в месяц. Годовой доход " +
                "вырос на " +(motivationDenchik-denchik)*12+" рублей.");
        System.out.println("Кристина теперь получает "+ motivatiomKris+" рублей в месяц. Годовой доход " +
                "вырос на " +(motivatiomKris-kris)*12+" рублей.");

    }
}