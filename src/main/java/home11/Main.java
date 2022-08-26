package home11;

public class Main { // записаться, чтобы разобраться с интерфейсами
    public static void main(String[] args) { // alt + Ins откроет окно
       //Methods m = new Methods() ;// Создали объект класса Methods, m - имя объекта, new - создай новый объект
       //int result = m.method(4,5) ;// result - то, что нам вернёт объект m
        //System.out.println(m.method(4,5) ); // вывод на экран результата исполнения метода сразу, без переменной
        //System.out.println(Methods.devide(10,2)); // вызвали статический метод
        Methods str = new Methods();
        System.out.println(str.getString());
        Cat honey = str.createCat(5,"Кот"); // результат создания кота
        System.out.println(honey.age + honey.name);



        /*IFlying foo = new Bird();
        foo = new Bug();
        foo.fly();

        Cat pussi = new Cat();
        pussi.name = "Кот";
        pussi.age = 3;
        pussi.say();
        Dog nord = new Dog();
        nord.name = "Пёс";
        nord.age = 5;
        nord.say();

         */

    }
}
