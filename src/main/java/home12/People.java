package home12;

public class People { // Теперь это базовый класс, в котором есть имя и возраст

    public People(String name, int age) { // делает обязательность чего-то, в данном случае имя
        this.name = name;
        this.age = age;
    }

    public People(String name){ // конструктор
        this.name = name;
    }

    protected String name; // String - тип объекта
    protected int age; // private - можно обратиться изнутри нашего класса
    // геттеры(что-то возвращает) и сеттеры (что-то получает) они для работы с приватными переменными

   /* public void setName(String name){//сеттер, void - ничего не возвращает(он всегда void) то есть set+имя переменной (String name) - Это поле
        this.name = name; // у этого объекта возьми поле name и положи ему значение name
    }

    public String getName(){
        return name;

    }

    */
    protected String company; // protected для того, чтобы переменная была доступна в классе наследнике

//    public  abstract  void whoIam();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Mr " + name; //добавим к имени Mr
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age + 1; //возраст + 1
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
