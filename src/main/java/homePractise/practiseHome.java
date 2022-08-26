package homePractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practiseHome {
    public static void main(String[] args) {
       // меню
        Scanner sc = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        while (true) {
            System.out.println("Введите комманду");
            Commands userChose = Commands.valueOf(sc.next());


            switch (userChose) {
                case ADD:
                    System.out.println("Какую машину вы хотите добавить? volvo / haval");
                    String carType = sc.next();
                    if(carType.equals("volvo")){
                        System.out.println("Введите цвет");//
                        String color = sc.next();
                        System.out.println("Введите цену");
                        int prise = sc.nextInt(); // считали сумму
                        Volvo car = new Volvo(color,prise);// присвоили цвет и сумму от данных выше
                        car.run(); // вывели метод run класса volvo
                        cars.add(car); // добавили машину в list
                    } else if(carType.equals("haval")){
                        System.out.println("Введите цвет");
                        String color = sc.next();
                        System.out.println("Введите цену");
                        int prise = sc.nextInt(); // считали сумму
                        Haval car = new Haval(color,prise);// присвоили цвет и сумму от данных выше
                        car.run(); // вывели метод run класса volvo
                        cars.add(car); // добавили машину в list
                    }
                    break;
                case LIST:
                    for(Car car : cars)
                    System.out.println(car); // список созданных машин
                    break;
                case EXIT:
                    System.out.println("Вы вышли");
                    System.exit(0); // в любом месте кода означает завершение программы
                    //break не нужен, итак выходим
                default:
                    System.out.println("wrong command");

            }

        }



    }

}
