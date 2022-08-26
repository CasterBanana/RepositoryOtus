package home11;

public class Methods {
    public int method (int a, int b){
        return a+b;

    }
    public static int devide(int a, int b){
        return  a/b;
    }
    public Cat createCat(int age, String name){ // () - что передаём в метод, аргументы его, Cat - тип возвращаемого объекта
        Cat cat = new Cat(); // создали конкретного cat
        cat.age = age; // указали age
        cat.name = name; // указали name
        return cat;
    }

    public String getString(){
        return "Слово";
    }
}
