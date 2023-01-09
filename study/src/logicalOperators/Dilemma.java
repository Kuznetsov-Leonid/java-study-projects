package logicalOperators;
/**
 * Напишем программу, которая будет считывать с клавиатуры возраст.
 * Если возраст от 20 до 60 (включительно), то выводить ничего не нужно, иначе - вывести фразу "можно не работать".
 * Сделать это можно (и нужно!) с помощью только одного оператора if без else.
 * Подсказка: используй логический оператор "||"
 * **/
public class Dilemma extends Input{
    public void DilemmaTask(){
        System.out.println("Программа на проверку возраста");
        System.out.println("Введите Ваш возраст: ");
        int age = sc.nextInt();
        boolean isYoung = (age < 20);
        boolean isOld   = (age > 60);
        String response = "Иди работать";
        if (isYoung || isOld) {
            response = "Можно не работать";
        }
        System.out.println(response);
    }
}
