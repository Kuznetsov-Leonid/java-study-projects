package HighAccuracy;
/**
 * Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
 * равны ли эти числа с точностью до одной миллионной.
 * **/
public class Accuracy {
    private double a = 1.0000003;
    private double b = 1.0000004;
    private String result = "";
    public void AccuracyTask(){
        result = Math.abs(b - a) < 0.00001 ? "Числа равны" : "Числа не равны";
        System.out.println(result);
    }
}
