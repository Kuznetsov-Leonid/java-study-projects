package ThreeNumber;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три целых числа.
 * Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел.
 * Если все три числа равны между собой, то вывести все три. Примеры:
 * а) при вводе чисел 1 2 2 получим вывод 2 2
 * б) при вводе числа 6 3 6 => 6 6
 * **/
public class ThreeNumberTask {
    private static boolean Any;
    private static boolean ab;
    private static boolean bc;
    private static boolean ac;
    public void ThreeNumberCheck(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        Any = ( a == b && b == c);
        ab  = ( a == b );
        bc  = ( b == c );
        ac  = ( a == c );

        if (Any){
            System.out.println(a + " " + b + " " + c);
        } else if (ab){
            System.out.println(a + " " + b);
        } else if (bc){
            System.out.println(b + " " + c);
        } else if (ac) {
            System.out.println(a + " " + c);
        } else {
            System.out.println("Числа не совпадают");
        }
        sc.close();
    }
}
