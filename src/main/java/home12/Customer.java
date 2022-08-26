package home12;

public class Customer extends People { // extends наследование означает

    public Customer(String name){
        super(name);

    }

    public void whoIam(){
        System.out.println("I am customer");
    }
}
