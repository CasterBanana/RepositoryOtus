package uslov;

public class usl {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        if (a == 5) {
            System.out.println("Равно");

        }
        else {
            System.out.println("Не равно");
        }
        // тернарный оператор
        int cash = 100;
        String result;

        if (cash > 60){
            result = "Покупка успешна";
        } else {
            result = "Недостаточно средств";
        }
        System.out.println(result);

        // вот тут уже пример тернарного оператора
        int cash1 = 100;
        String result1 = cash1 > 60 ? "Покупка успешна" : "Недостаточно средств";
        System.out.println(result1);
        /* cash1 > 60 - условие
        ? "Покупка успешна" - делаем, если выполняется условие
         : "Недостаточно средств" - иначе выполнится это
          не очень удобная штука, лучше if-else использовать*/


    }




}
