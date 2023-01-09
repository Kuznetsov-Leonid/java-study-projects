package logicalOperators;
/**
 * Ввести с клавиатуры два целых числа, которые будут координатами точки
 * (первое считанное число - это координата "x", а второе - координата "y").
 * Известно, что точка не лежит на координатных осях OX и OY.
 * Вывести на экран номер координатной четверти, в которой находится данная точка.
 * **/
public class Coordinate extends Input{
    public void CoordinateTask(){
        System.out.println("Узнаем четверть координатной оси.");
        System.out.println("Ввести с клавиатуры два целых числа, которые будут координатами точки: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int quarter = 0;
        if (x < 0 && y > 0){
            quarter = 1;
        }
        if (x > 0 && y > 0){
            quarter = 2;
        }
        if (x < 0 && y < 0){
            quarter = 3;
        }
        if (x > 0 && y < 0){
            quarter = 4;
        }
        System.out.println("Координата принадлежит " + quarter + "четверти.");
    }
}
