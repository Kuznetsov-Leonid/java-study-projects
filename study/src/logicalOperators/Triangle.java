package logicalOperators;
/**
 * Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
 * Для этого тебе нужно:
 * 1. Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
 * 2. Определить возможность существования треугольника по сторонам.
 * **/
public class Triangle extends Input{
    public void TriangleTask(){
        System.out.println("Проверка на существование треугольника");
        System.out.println("Введите три стороны: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        boolean isTrue = (( a > 0 ) && ( b > 0 ) && ( c > 0 ));
        if (isTrue){
            System.out.println("Треугольник существует!");
        } else {
            System.out.println("Треугольник не существует!");
        }
    }
}
