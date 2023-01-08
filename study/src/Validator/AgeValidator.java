package Validator;

import java.util.Scanner;

public class AgeValidator {
    /**
     * Ввести с клавиатуры имя и возраст.
     * Если возраст в пределах 18-28 (включительно),
     * то вывести надпись "Имя, явитесь в военкомат",
     * где Имя - это имя, введенное ранее с клавиатуры.
     * Пример ввода: Amigo 18 Пример вывода: Amigo, явитесь в военкомат
     * **/

    public void ArmyCompany(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = input.nextLine();
        System.out.println("Введите ваш возвраст: ");
        int age = input.nextInt();
        if (age >= 18 && age <= 28){
            System.out.println(name + ", явистесь в военкомат!");
        } else if (age >= 29) {
            System.out.println(name + ", вы откосили.");
        } else {
            System.out.println(name + ", вы не достигли призывного возвраста.");
        }
        input.close();
    }
}
