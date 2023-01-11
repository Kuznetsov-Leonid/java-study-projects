package CompareStrings;

import logicalOperators.Input;

/**
 * Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
 * **/
public class Comparse extends Input {
    public void ComparseTask(){
        System.out.println("Введите слово: ");
        String a = sc.nextLine();
        System.out.println("Введите ещё слово: ");
        String b = sc.nextLine();
        String result = a.equals(b) ? "Строки ровны" : "Строки разные";
        System.out.println(result);
    }
}
