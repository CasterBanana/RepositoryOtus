package ShildtPractise.home21Sound;

public class Sound {
    public static void main(String[] args) {
        //рассчитываем скорость звука от вспышки молнии и до места
        // скорость звука 1100 и время до места 7.2
        double dist = 1100 * 7.2; // double для плавающей точки
        System.out.println("Расстояние до места вспышки молнии " + "составляет " + dist + " футов");
        // рассчитаем расстояние до объекта при помощи эха,
        // скорость звука 343 метров в секунду, время прихода эха 7.2 секунды
        double distMetr = (343 * 7.2)/2 ;
        System.out.println("Расстояние прохождения звука от меня до объекта равно " + distMetr + " метров");
        //присвоения
        int x = 0;
        x += 10;// Тоже самое, что и x = x + 10;
        System.out.println(x);
        int y = 1;
        y+=15;
        System.out.println(y); // выведет число 16 1+15
        y -=4 ; //16 - 4
        System.out.println(y);// выведет 12



    }
}
