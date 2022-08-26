package ShildtPractise.switchArrays;

import java.util.Scanner;

public class EnteringTheMonth {
    public static void main(String[] args) {
        Switcher months = new Switcher();// сделали экземпляр класса Switcher
        Scanner console = new Scanner(System.in);// чтобы вводить с консоли
        System.out.println("Введите число месяца от 1 до 12");
        int month = console.nextInt();// переменная для получения значения
        String value = months.switcherMethod(month);// передали в метод значение, в value передали months.switcherMethod(month)
        System.out.println("Ваш месяц: " + value); // по идее выводим результат значения


    }
}
