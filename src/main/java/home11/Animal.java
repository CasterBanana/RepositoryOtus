package home11;

public abstract class Animal { // абстрактный класс
    public String name; // свойство
    public int age; // свойство

    public void eat(){
        System.out.println("Я кушаю");
    }
    public void drink(){
        System.out.println("Я пью");
    }
    public abstract void say(); // все животные говорят по-разному и поэтому реализацию оставим на класс наследники



}
