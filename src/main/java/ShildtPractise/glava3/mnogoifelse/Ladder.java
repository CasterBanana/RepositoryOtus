package ShildtPractise.glava3.mnogoifelse;

public class Ladder {
    public static void main(String[] args) {
        int x; // объявили переменную x
        for(x = 0; x < 6; x++){ // цикл, который будет работать, пока x != 6, присвоили x = 0
            if(x==1) // если в цикле for x = 1, то выведетется текст ниже, но в первый раз выведется самый последний else
                // если бы в for было ++x, то тогда выполнился бы первый if сразу
                System.out.println("x равно единице");
            else if (x==2)
                System.out.println("x равно двум");
            else if(x==3)
                System.out.println("x равно трём");
            else if(x==4)
                System.out.println("x равно четырем");
            else
                System.out.println("Значение x находится вне диапазона 1 - 4");

        }
    }
}
