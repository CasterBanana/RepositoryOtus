package ShildtPractise.glava3.uslovie;

import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'S'; // две переменных типа char, одна проиницилизирована
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read(); // получить символ с клаватуры

        if (ch == answer) System.out.println("** Правильно! **"); // если введут с клавиатуры S
        else {
            System.out.print("...Извините, вы не угадали, нужная буква находится "); // ввели что-то иное от S
            // вложенные условные операторы if
            if(ch < answer) // если введённая идёт раньше искомой, то ближе к концу алфавита выведется, если после искомой, то ближе к началу
                System.out.println("ближе к концу алфавита");
            else System.out.println("ближе к началу алфавита");

            }
    }
}