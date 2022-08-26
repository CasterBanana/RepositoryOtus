package ShildtPractise.lesson2;

public class TrainingSwitch {
    public static void main(String[] args) { // делать с самого начала все примеры из учебника
        int i;
        for(i = 0; i < 4; i++){
            switch (i){ // в switch положили i, которая на первую итерацию равна 0
                case 0:
                    System.out.println("i равно нулю");
                    System.out.println(i);
                    break;
                case 1:
                    System.out.println("i равно одному");
                    System.out.println(i);
                    break;
                case 2:
                    System.out.println("i равно двум");
                    System.out.println(i);
                    break;
                default:
                    System.out.println("i больше или равно трём");
                    System.out.println(i);

            }

        }
    }
}
