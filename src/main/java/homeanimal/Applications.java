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
                        System.out.println("Какое животное вы хотите добавить? cat/dog/duck");// попробовать завернуть в цикл while для того, чтобы определять cat/dog/duck
                        String animalType = sc.next().toLowerCase();
                        if (animalType.equals("cat")) {
                            Cat cat = new Cat();// присвоили имя, возраст, вес и цвет от данных выше
                            fillAnimal(sc,cat);
                            //добавить в список animals кота
                            cat.say();
                            animals.add(cat);
                        } else if (animalType.equals("dog")) {
                            Dog dog = new Dog();// присвоили имя, возраст, вес и цвет от данных выше
                            fillAnimal(sc,dog);
                            // добавить в список animals собаку
                            dog.say();
                            animals.add(dog);
                        } else if (animalType.equals("duck")) {
                            Duck duck = new Duck();// присвоили имя, возраст, вес и цвет от данных выше
                            fillAnimal(sc,duck);
                            // добавить в список animals утку
                            duck.say();
                            animals.add(duck);
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

        private static void fillAnimal(Scanner console, Animal animal){
            System.out.println("Введите имя");//
            String name = console.next(); // считали имя
            System.out.println("Введите возраст");
            int age = getUserprint(console);
            //int age = console.nextInt(); // считали возраст
            System.out.println("Введите вес");
            int weight = getUserprint(console);
            //int weight = console.nextInt(); // считали вес
            System.out.println("Введите цвет");
            String color = console.next(); // считали цвет
            animal.setName(name);
            animal.setAge(age);
            animal.setWeight(weight);
            animal.setColor(color);
        }

        private static int getUserprint(Scanner console){
            int number;
            do {
                while (!console.hasNextInt()) {
                    System.out.println("Вы ввели не число, введите число");
                    console.next();
                }
                number = console.nextInt();
            } while (number <= 0);
            System.out.println("Значение не может быть меньше 1, введите снова ");
            return number;

        }



    }

