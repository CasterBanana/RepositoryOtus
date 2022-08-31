package practyse;

import java.util.Scanner;
// https://ru.stackoverflow.com/questions/599048/java-Метод-для-генерации-постфикса-к-возрасту-год-года-лет
public class ChekAges {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // исключения не работают с 11-14
        int age = console.nextInt();
        System.out.println("Вы ввели значение: " + age);
        int ageConsole = age % 10;
        boolean isExclusionAge = (age % 100 >= 11) && (age % 100 <= 14);
        //1 год 2 года 5 лет
        if (ageConsole == 1 & !isExclusionAge){
            System.out.println("год");
        }
        else if (ageConsole == 0 || ageConsole >= 5){
            System.out.println("лет");
        }
        else if (ageConsole >= 2){
            System.out.println("года");
        }
        if (isExclusionAge) {
            System.out.println("лет");
        }

    }
}
