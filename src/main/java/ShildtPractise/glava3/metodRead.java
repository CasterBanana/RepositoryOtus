package ShildtPractise.glava3;

import java.io.IOException;

//чтение символа с клавиатуры
public class metodRead {
    public static void main(String[] args) throws IOException {
            char ch;

            System.out.println("Нажмите нужну клавишу, а зачем клавишу ENTER: ");
            //System.in - объект ввода с клавиатуры, read() ожадине нажатия клавиши, после чего возвращает результат
            // Возвращаемый им сивлом представлен целочисленным значением, поэтому, прежде чем присвоить его символьной переменной
            // Следует выполнить явное приведение к типу char, в данном случае в буфере хранится целая текстовая строка
            ch = (char) System.in.read(); // вроде как привели переменную к типа char (char)

            System.out.println("Вы нажали клавишу " + ch);



    }
}
