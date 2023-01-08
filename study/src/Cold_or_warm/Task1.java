package Cold_or_warm;

import java.util.Scanner;

public class Task1 {
    /**
     * Ввести с клавиатуры температуру на улице.
     * Если температура меньше 0, вывести надпись "на улице холодно",
     * иначе - вывести надпись "на улице тепло".
     * **/
    public void thermometer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите темпиратуру: ");
        int temperature = input.nextInt();

        if (temperature < 0){
            System.out.println("На улице холодно");
        } else {
            System.out.println("На улице тепло");
        }
        input.close();
    }

    //инлайн версия ввода
    public void thermometerPro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите темпиратуру: ");
        int temperature = input.nextInt();

        String result = temperature < 0 ? "На улице холодно" : "На улице тепло";

        System.out.println(result);
        input.close();
    }
}
