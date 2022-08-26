package cycles;

public class cycles {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { /* i = 0 - стартовое значение, i < 5 - условие выполнения, пока не станет 5,
         i++ - повышение на +1
          объявление счётчика можно вынести раньше*/
            System.out.println("Hi1 " + i);
        }


            int [] mass = {12, 32, 434, 55, 76, 89};
            for (int i =0; i<mass.length; i++) {
                System.out.println("i = " + i); // здесь вывели элементы массива поочередно
                System.out.println(mass[i]);
                if (i == 3){
                    System.out.println(mass[i] + 1000); // если элемент(или индекс?) массива равен 3, то прибавляем 1000 к нему
                }

        }
        //foreach - для каждого из чего-то (списка, массива)
        for (int element : mass){ // int element - объявили имя переменной, : mass - сам массив, по нему само пробежалось
            System.out.println(element); // element - значение массива

        }


        // while - пока условие выполняется, то код исполняется,
        int a = 0;
        while (a < 15){ // условие
            System.out.println("!!!");
            a+=2; // прибавка на 2
        }

        // do while - сначала что-то делаем, а потом проверяем условие
        int b = 10;
        do {
            System.out.println("Пепега");
            b++;
        } while (b<5);
        // методы и рекурсия осталась



    }
}
