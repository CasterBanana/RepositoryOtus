import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main (String[] arg) {
        int size = 10;
        System.out.println(size);
        size = 22;
        System.out.println(size);

        final int SIZE1 = 15; /*имя переменной константы принято писать с заглавной,
        модификатор final указывает, что это константа */
        System.out.println(SIZE1);

        //массивы - Упорядоченный набор данных, шкаф к примеру, он массив, а полки его индексы
        int[] numbers; // так принято в основном объявлять массив
        //инициализация
        int[] numbers1 = new int[3]; // инициализация массива int состоящий из 6 элементов
        // new указывать нужно для создания массива, объекта, оно обязательно
        numbers1[0] = 3; // указали в ячейке массива значение
        numbers1[1]= 4;
        numbers1[2] = 6;
        int[] something = {12, 34, 44}; // создали массив с конкретными значениями
        System.out.println(something[1]); // вывели второе значение

        int[] something1 = {12, 34, 44}; /* можно использовать final, но тогда переписать полностью нельзя,
         но в ячейку отдельно можно */
        something1[0] = 1; // перезаписали массив, ограничение на длину, как у примитива
        something1[1] = 2;
        System.out.println("Длина массива равна "  + something1.length);
        // многомерные массивы
        int[][] mnogomer = new int[5][9]; // инициализировали пустой массив 5 на 9
        int[][] mgomer1 = new int[][]{{0,1,3}, {1,3,2}}; // многомерный массив со значениями
        System.out.println("Ячейка массива 1-2 равна " + mgomer1[1][0]);
        // list - список, java.util.List
        List<String> peoples = new ArrayList<>();/* () - Начальный размер списка, необязателен, list внутри себя хранит массив, он саморасширяющийся
        <String> - указывает тип списка, не может быть примитивом, для int использовать Integer*/

        peoples.add("Valera");// .add - метод добавления строки в список list
        peoples.add("Sergey"); // ещё добавили
        peoples.add(2,"Sara"); // добавили второй элемент списка, то есть точно второй = Sara
        System.out.println(peoples.get(0));// вывод нулевой элемент списка
        System.out.println(peoples.indexOf("Sergey")); // вывели индекс списка по значению элемента
        System.out.println(peoples); // вывели весь список
















    }
}
