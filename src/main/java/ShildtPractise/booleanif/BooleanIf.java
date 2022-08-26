package ShildtPractise.booleanif;

public class BooleanIf {
    public static void main(String[] args) {
        boolean b; // вообще по умолчанию он принимает false
        b = false; // проинициализировали переменную b и дали false
        System.out.println("Значение b: " + b); // выведет false
        b = true;//изменили значение на true
        System.out.println("Значение b: " + b);// выведет true

        // Конструкция if(b) проверяет если b == true
        if(b) System.out.println("Эта инструкция выполняется");

        b = false;
        if(b) System.out.println("Эта инструкция не выполняется");

        // Итак, по коду ниже, я так понимаю, если писать сравнение какое-то,
        // то он выведет выполняется оно или нет, то есть true или false
        System.out.println("Результат сравнения 10 > 9: " + (10 > 9));
    }
}
