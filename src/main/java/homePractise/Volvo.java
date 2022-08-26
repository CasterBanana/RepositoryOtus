package homePractise;

public class Volvo extends Car{
    public Volvo(String color, int price) {
        super(color, price); // вызвали конструктор
    }

    @Override // хотя тут я вручную переписывал метод) а аннотация для удобства и понимания указывает
    public void run(){
        System.out.println("Volvo bip bip");
    }

}
