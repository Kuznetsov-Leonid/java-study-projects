package LookingForMaximum;

import logicalOperators.Input;

/**
 * У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.
 * Если числа одинаковые, то выводится любое.
 * **/
public class Maximum extends Input {
    public void MaximumTask(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a > b ? a : b;
        System.out.println(result);
    }
}
