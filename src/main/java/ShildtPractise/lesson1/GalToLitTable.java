package ShildtPractise.lesson1;

public class GalToLitTable {
    public static void main(String[] args) {
        //расчет дюймов в метры
        double dm, metre; // 1 метр равен 39.73
        int count = 0;
        for (dm = 1; dm <= 100 ; dm++){
            metre = dm * 39.73;
            System.out.println(dm + " дюйм соотвествует " + metre + " метров");
            count++; // сделали счётчик с привязкой к дюйму
            if(count == 12){ // как бы приравняли счётчик к дюйму 1 к 1
                System.out.println(""); //выводим пустую строку
                count = 0;// обнулили, ещё раз на 12 пустую строку вывело
            }

        }



//        double weightEarth, weightMoon; //вес на земле, вес на луне;
//        weightEarth = 90;
//        weightMoon = (weightEarth/100)*17;
//        System.out.println(weightMoon);


//        double gallons, litres;
//        int counter;
//
//        counter = 0; // счётчик
//        for(gallons = 1; gallons <= 100; gallons++){ // преобразуем до 100 галлонов в литры
//            litres = gallons * 3.7854;// преобразуем галлоны в литры
//            System.out.println(gallons + " галлонам соответствует " + litres + " литров");
//            counter++;
//            if (counter == 10){
//                System.out.println();
//                counter = 0;
//            }
//        }

    }
}
