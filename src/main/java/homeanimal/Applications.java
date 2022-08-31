package homeanimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Applications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new ArrayList();// список animal

        while (true) {
            try {
                System.out.println("Введите комманду: ADD, LIST или EXIT");
                CommandConsole userChoise = CommandConsole.valueOf(sc.next().toUpperCase()); // sc - наименование переменной, которая принимает значение из консоли
                // valueOf - значение из чего-то, значение из sc.next


                switch (userChoise) {
                    case ADD:
                        System.out.println("Какое животное вы хотите добавить? cat/dog/duck");
                        String animalType = sc.next().toLowerCase();
                        if (animalType.equals("cat")) {
                            System.out.println("Введите имя");//
                            String name = sc.next(); // считали имя
                            System.out.println("Введите возраст");
                            int age = sc.nextInt(); // считали возраст
                            System.out.println("Введите вес");
                            int weight = sc.nextInt(); // считали вес
                            System.out.println("Введите цвет");
                            String color = sc.next(); // считали цвет
                            Cat cat = new Cat(name, age, weight, color);// присвоили имя, возраст, вес и цвет от данных выше
                            //добавить в список animals кота
                            cat.say();
                            animals.add(cat);
                            //car.run(); // вывели метод run класса volvo
                        } else if (animalType.equals("dog")) {
                            System.out.println("Введите имя");//
                            String name = sc.next();
                            System.out.println("Введите возраст");
                            int age = sc.nextInt(); // считали сумму
                            System.out.println("Введите вес");
                            int weight = sc.nextInt();
                            System.out.println("Введите цвет");
                            String color = sc.next();
                            Dog dog = new Dog(name, age, weight, color);// присвоили имя, возраст, вес и цвет от данных выше
                            // добавить в список animals собаку
                            dog.say();
                            animals.add(dog);
                            //car.run(); // вывели метод run класса volvo
                        } else if (animalType.equals("duck")) {
                            System.out.println("Введите имя");//
                            String name = sc.next();
                            System.out.println("Введите возраст");
                            int age = sc.nextInt(); // считали сумму
                            System.out.println("Введите вес");
                            int weight = sc.nextInt();
                            System.out.println("Введите цвет");
                            String color = sc.next();
                            Duck duck = new Duck(name, age, weight, color);// присвоили имя, возраст, вес и цвет от данных выше
                            // добавить в список animals утку
                            duck.say();//sdsdsa
                            animals.add(duck);
                            //car.run(); // вывели метод run класса volvo
                        }
                        break;
                    case LIST:
                        for (Animal animal : animals) // пробегаемся по списку животных animals
                            System.out.println(animal); // выводим значение списка animals
                        break;

                    case EXIT:
                        System.out.println("Вы вышли");
                        System.exit(0); // в любом месте кода означает завершение программы
                        //break не нужен, итак выходим
                    default:
                        System.out.println("wrong command");
                }
            } catch (IllegalArgumentException ex){
                System.out.println("Введена неверная комманда");
                //System.exit(400);

            }
        }

        }





//        Animal dog = new Animal();
//        dog.setName("Барбас");
//        dog.setWeight(100);
//        dog.setAge(15);
//        dog.setColor("белый");
//        System.out.println(dog); // что-то работает


    }

