package BodyTemp;

import java.util.Scanner;

/**
 * Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том,
 * что температура тела высокая, низкая или нормальная, в зависимости от условий.
 * В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая),
 * в которые нужно вынести соответствующие условия.
 * **/
public class BodyTempTask {
    public void CheckTempBody(){
        Scanner input = new Scanner(System.in);
        double standartTempBody = 36.6;
        double inputTempBody = input.nextDouble();
        boolean isHigh = (inputTempBody > standartTempBody);
        boolean isLow = (inputTempBody < standartTempBody);
        boolean isNormal = (inputTempBody == standartTempBody);
         if (isHigh){
             System.out.println("температура тела высокая");
         } else if (isLow) {
             System.out.println("температура тела низкая");
         } else if (isNormal) {
             System.out.println("температура тела нормальная");
         }
         input.close();
    }
}
