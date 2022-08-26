package methods;

public class methods {
    static int calculateFactorial(int number){
        int result = 1;
        for (int i = 1; i <=number; i ++){
            result = result*i;
        }
        return result;
    }

    static int calculateFactorial2(int number){
        if (number == 1)
            return 1;
        return number * calculateFactorial2(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial2(5));
    }
}


